package com.narxoz.rpg.combat;
public class FlameBreath implements Ability {
    public String getName() {
         return "Flame Breath"; 
        }
    public int getDamage() { 
        return 120; 
    }
    public String getDescription() { 
        return "fire damage + burn"; 
    }
    public Ability clone() { 
        return new FlameBreath(); 
    }
}