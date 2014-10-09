package com.basecolon.FireJemblem.deprecated.items.weapons.axes;

import com.basecolon.FireJemblem.constants.component.item.weapon.WeaponTypes;
import com.basecolon.FireJemblem.deprecated.items.weapons.Weapon;

/**
 * @author kevinmost
 * @date 10/7/14
 */
public abstract class Axe extends Weapon {
    @Override
    public WeaponTypes getType() {
        return WeaponTypes.AXE;
    }
}