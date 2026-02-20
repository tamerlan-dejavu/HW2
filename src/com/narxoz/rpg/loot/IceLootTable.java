package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class IceLootTable implements LootTable {
    private List<String> items;
    private int gold;
    private int experience;

    public IceLootTable() {
        this.items = new ArrayList<>();
        items.add("Ice Gem");
        items.add("Frost Scale");
        items.add("Ice Rune");
        this.gold = 140;
        this.experience = 280;
    }


    @Override public List<String> getItems() { return new ArrayList<>(items); }
    @Override public int getGoldDrop() { return gold; }
    @Override public int getExperienceDrop() { return experience; }
    @Override public String getLootInfo() { return items.toString(); }
    @Override public LootTable clone() {
        return new IceLootTable();
    }

}
