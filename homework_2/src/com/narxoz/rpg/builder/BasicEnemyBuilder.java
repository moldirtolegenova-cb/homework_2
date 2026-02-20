package com.narxoz.rpg.builder;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;
public class BasicEnemyBuilder implements EnemyBuilder {
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected int speed;
    protected String element;
    protected List<Ability> abilities = new ArrayList<>();
    protected LootTable loot;
    protected String ai;
    protected Map<Integer, Integer> phases = new HashMap<>();
    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public EnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }
    public EnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }
    public EnemyBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }
    public EnemyBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
    public EnemyBuilder setElement(String element) {
        this.element = element;
        return this;
    }
    public EnemyBuilder setAbilities(List<Ability> abilities) {
        this.abilities = new ArrayList<>(abilities); 
        return this;
    }
    public EnemyBuilder setLootTable(LootTable loot) {
        this.loot = loot;
        return this;
    }
    public EnemyBuilder setAI(String ai) {
        this.ai = ai;
        return this;
    }
    public EnemyBuilder addPhase(int phase, int threshold) {
        this.phases.put(phase, threshold);
        return this;
    }
    public Enemy build() {
        if (name == null || health <= 0) {
            throw new IllegalStateException("Invalid enemy");
        }
        return new Goblin(name, health, damage, defense, speed,
                element, abilities, loot, ai, phases);
    }
    @Override
    public EnemyBuilder setLootTable(List<String> loot) {
        throw new UnsupportedOperationException("Unimplemented method 'setLootTable'");
    }
}