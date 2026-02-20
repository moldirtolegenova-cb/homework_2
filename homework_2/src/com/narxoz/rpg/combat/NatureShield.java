package com.narxoz.rpg.combat;
public class NatureShield implements Ability {
    public String getName() { 
        return "Barkskin"; }
    public int getDamage() { 
        return 0; }
    public String getDescription() { 
        return "Hardens skin to reduce damage"; }
    public Ability clone() { 
        return new NatureShield(); }
}