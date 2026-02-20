package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.*;
public class BossEnemyBuilder extends BasicEnemyBuilder {
    @Override
    public Enemy build() {
        if(name == null || health <= 0) throw new IllegalStateException("Validation failed");
        return new DragonBoss(name, health, damage, defense, speed, element, abilities, loot, ai, phases);
    }
}