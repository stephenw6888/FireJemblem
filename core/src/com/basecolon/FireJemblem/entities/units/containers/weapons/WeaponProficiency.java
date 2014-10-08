package com.basecolon.FireJemblem.entities.units.containers.weapons;

import com.basecolon.FireJemblem.constants.weapons.WeaponProficiencyLevels;
import com.basecolon.FireJemblem.constants.weapons.WeaponTypes;
import com.basecolon.FireJemblem.entities.items.weapons.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kevinmost
 * @date 10/7/14
 */
public class WeaponProficiency {

    // Map of Weapon types (ex: Sword) to the user's proficiency level in that weapon (ex: C)
    private Map<WeaponTypes, WeaponProficiencyLevels> weapons = new HashMap<>();

    // Preferred weapons that this character can use regardless of skill level (EX: Lyn's Mani Katti)
    private List<Class<? extends Weapon>> preferredWeapons = new ArrayList<>();

    public WeaponProficiency() {
        // Add each weapon to the Map, with a proficiency of "NO" (these can be overwritten individually for each character)
        for (WeaponTypes type : WeaponTypes.values()) {
            weapons.put(type, WeaponProficiencyLevels.NO);
        }
    }

    public Map<WeaponTypes, WeaponProficiencyLevels> getWeapons() {
        return weapons;
    }

    public List<Class<? extends Weapon>> getPreferredWeapons() {
        return preferredWeapons;
    }

    public WeaponProficiency setWeaponProficiencyLevel(WeaponTypes weapon, WeaponProficiencyLevels level) {
        if (level == WeaponProficiencyLevels.PRF) {
            throw new PrfNotAllowedException("You cannot set a Unit's weapon proficiency to \"Prf\". \"Prf\" is a reserved weapon rank for weapons that can only be used by specific characters");
        }
        weapons.put(weapon, level);
        return this;
    }

    public WeaponProficiency setPreferredWeapon(Class<? extends Weapon> preferredWeapon) {
        preferredWeapons.add(preferredWeapon);
        return this;
    }
}
