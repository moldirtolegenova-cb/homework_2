package com.narxoz.rpg.loot;
import java.util.List;
public class NatureLootTable implements LootTable {
    public List<String> getItems() { return List.of("Ancient Bark", "Emerald Leaf", "Nature Rune"); }
    public int getGoldDrop() {
         return 300;
         }
    public int getExperienceDrop() { 
        return 800; 
    }
    public LootTable clone() {
        return new NatureLootTable(); 
    }
}