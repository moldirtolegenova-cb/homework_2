package com.narxoz.rpg.loot;
import java.util.List;
public class IceLootTable implements LootTable {
    public List<String> getItems() {
        return List.of("Ice Gem", "Frost Scale", "Ice Rune");
    }
    public int getGoldDrop() { 
        return 450; 
    }
    public int getExperienceDrop() { 
        return 900; 
    }
    public LootTable clone() { 
        return new IceLootTable(); 
    }
}
