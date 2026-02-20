package com.narxoz.rpg.combat;
public class FrostBreath implements Ability {
    public String getName() { 
        return "Frost Breath"; 
    }
    public int getDamage() { 
        return 90; 
    }
    public String getDescription() { 
        return "Ice damage + slow"; 
    }
    public Ability clone() { 
        return new FrostBreath(); 
    }
}