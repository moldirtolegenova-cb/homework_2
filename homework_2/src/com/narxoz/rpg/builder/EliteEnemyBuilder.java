package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.*;
public class EliteEnemyBuilder extends BasicEnemyBuilder {
    @Override
    public Enemy build() {
        if(name == null) throw new IllegalStateException("Name is required");
        return new OrcWarrior(name, health, damage, defense, speed, element, abilities, loot, ai, phases);
    }
}