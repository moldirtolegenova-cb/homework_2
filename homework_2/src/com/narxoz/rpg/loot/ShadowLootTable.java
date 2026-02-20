package com.narxoz.rpg.loot;
import java.util.List;
public class ShadowLootTable implements LootTable {
    public List<String> getItems() {
        return List.of("Shadow Gem", "Dark Essence", "Shadow Rune");
    }
    public int getGoldDrop() { 
        return 600; 
    }
    public int getExperienceDrop() { 
        return 1200; 
    }
    public LootTable clone() { 
        return new ShadowLootTable(); 
    }
}