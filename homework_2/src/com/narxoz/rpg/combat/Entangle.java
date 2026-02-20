package com.narxoz.rpg.combat;
public class Entangle implements Ability {
    public String getName() { 
        return "Entangle"; 
    }
    public int getDamage() {
         return 40; 
        }
    public String getDescription() { 
        return "Roots the target with vines"; 
    }
    public Ability clone() { 
        return new Entangle();
     }
}