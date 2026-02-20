package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class ShadowLootTable implements LootTable {

    private List<String> items;
    private int gold;
    private int experience;

    public ShadowLootTable() {
        this.items = new ArrayList<>();
        items.add("Shadow Gem");
        items.add("Dark Essence");
        items.add("Shadow Rune");
        this.gold = 160;
        this.experience = 320;
    }

    @Override public List<String> getItems() { return new ArrayList<>(items); }
    @Override public int getGoldDrop() { return gold; }
    @Override public int getExperienceDrop() { return experience; }
    @Override public String getLootInfo() { return items.toString(); }
    @Override public LootTable clone() {
        return new ShadowLootTable();
    }

}
