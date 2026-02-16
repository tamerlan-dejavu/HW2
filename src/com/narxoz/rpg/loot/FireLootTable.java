package com.narxoz.rpg.loot;

import java.util.List;

public class FireLootTable extends LootTable {
    public FireLootTable(int goldDrop, int experienceDrop) {
        super(goldDrop, experienceDrop);
        this.items.addAll(List.of("Fire gem", "Dragon Scale"));
    }

    @Override
    public void displayLoot() {
        System.out.println("--- Fire Loot Table ---");
        System.out.println("Items: " + getItems());
        System.out.println("Gold: " + goldDrop + " | Exp: " + experienceDrop);
    }
}