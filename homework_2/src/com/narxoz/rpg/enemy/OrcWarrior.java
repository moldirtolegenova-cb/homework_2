package com.narxoz.rpg.enemy;
import java.util.*;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
public class OrcWarrior extends Enemy {
    public OrcWarrior(String name, int health, int damage, int defense, int speed,
                      String element, List<Ability> abilities, LootTable loot,
                      String ai, Map<Integer, Integer> phases) {
        super(name, health, damage, defense, speed, element, abilities, loot, ai, phases);
    }
    @Override
    protected Enemy createClone(List<Ability> abilities, LootTable loot, Map<Integer, Integer> phases) {
        return new OrcWarrior(this.name, 
            this.health, 
            this.damage, 
            this.defense, 
            this.speed, 
            this.element, abilities, loot, this.ai, phases);
    }
}