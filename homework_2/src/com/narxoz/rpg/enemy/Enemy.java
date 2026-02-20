package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;
public abstract class Enemy implements Cloneable {
    protected String name, element, ai;
    protected int health, damage, defense, speed;
    protected List<Ability> abilities;
    protected LootTable loot;
    protected Map<Integer, Integer> phases;
    public Enemy(String name, int health, int damage, int defense, int speed,
                 String element, List<Ability> abilities, LootTable loot,
                 String ai, Map<Integer, Integer> phases) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.element = element;
        this.abilities = abilities;
        this.loot = loot;
        this.ai = ai;
        this.phases = phases;
    }
    public int getHealth() {
        return health;
    }
    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }
    public Enemy clone() {
        List<Ability> abilityCopies = new ArrayList<>();
        for (Ability a : abilities) abilityCopies.add(a.clone());
        Map<Integer, Integer> phaseCopies = new HashMap<>(phases);
        LootTable lootCopy = (loot != null) ? loot.clone() : null;
        return createClone(abilityCopies, lootCopy, phaseCopies);
    }
    protected abstract Enemy createClone(List<Ability> abilities, LootTable loot, Map<Integer, Integer> phases);
    public void show() {
        System.out.println(name + " [" + element + "] HP:" + health +
                " DMG:" + damage + " AI:" + ai +
                " Phases:" + phases.size());
    }
}