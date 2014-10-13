package com.basecolon.FireJemblem.ashley.system.unit;

import com.badlogic.ashley.core.Entity;
import com.basecolon.FireJemblem.ashley.entity.FireEmblemEntities;
import com.basecolon.FireJemblem.ashley.system.FireEmblemSystem;

/**
 * @author kevinmost
 * @date 10/8/14
 */
public class UnitSystem extends FireEmblemSystem {
    UnitSystem(FireEmblemEntities entity) {
        super(entity);
    }

    @Override
    public void processEntity(Entity entity, float deltaTime) {
    }
}

