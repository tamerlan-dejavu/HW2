package com.narxoz.rpg.loot;

import java.util.List;
import java.util.ArrayList;

public abstract class LootTable implements Cloneable {
    protected List<String> items;
    protected int goldDrop;
    protected int experienceDrop;

    public LootTable(int goldDrop, int experienceDrop) {
        this.goldDrop = goldDrop;
        this.experienceDrop = experienceDrop;
        this.items = new ArrayList<>();
    }

    // Общие геттеры для всех подклассов
    public List<String> getItems() { return new ArrayList<>(items); }
    public int getGoldDrop() { return goldDrop; }
    public int getExperienceDrop() { return experienceDrop; }

    public abstract void displayLoot();

    @Override
    public LootTable clone() {
        try {
            LootTable copy = (LootTable) super.clone();
            copy.items = new ArrayList<>(this.items);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone LootTable", e);
        }
    }
}
