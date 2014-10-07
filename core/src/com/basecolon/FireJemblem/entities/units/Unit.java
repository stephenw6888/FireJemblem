package com.basecolon.FireJemblem.entities.units;

import com.badlogic.gdx.graphics.Texture;
import com.basecolon.FireJemblem.constants.classes.ClassTypes;
import com.basecolon.FireJemblem.entities.units.containers.inventory.Inventory;
import com.basecolon.FireJemblem.entities.units.containers.weapons.WeaponProficiency;

/**
 * @author kevinmost
 * @date 10/7/14
 */
public abstract class Unit {

    private Texture characterPortrait;

    private int level;
    private int experience;
    private ClassTypes classType;

    private Inventory inventory = new Inventory();
    private WeaponProficiency proficiency = new WeaponProficiency();

    protected Unit(Texture characterPortrait, int level, int experience, ClassTypes classType, Inventory inventory, WeaponProficiency proficiency) {
        this.characterPortrait = characterPortrait;
        this.level = level;
        this.experience = experience;
        this.classType = classType;
        this.inventory = inventory;
        this.proficiency = proficiency;
    }

    public void gainExperience(int experience) {
        this.experience += experience;

        while(this.experience > 100) {
            levelUp();
        }
    }
    public int getLevel() {
        return level;
    }
    public void levelUp() {
        // TODO Display stats screen
        level++;
        experience -= 100;
    }

    public Inventory inventory() {
        return inventory;
    }
}
