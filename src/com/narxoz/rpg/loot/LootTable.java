// package com.narxoz.rpg.loot;

// import java.util.List;
// import java.util.ArrayList;

// public abstract class LootTable implements Cloneable {
//     protected List<String> items;
//     protected int goldDrop;
//     protected int experienceDrop;

//     public LootTable(int goldDrop, int experienceDrop) {
//         this.goldDrop = goldDrop;
//         this.experienceDrop = experienceDrop;
//         this.items = new ArrayList<>();
//     }

//     // Общие геттеры для всех подклассов
//     public List<String> getItems() { return new ArrayList<>(items); }
//     public int getGoldDrop() { return goldDrop; }
//     public int getExperienceDrop() { return experienceDrop; }


//     @Override
//     public LootTable clone() {
//         try {
//             LootTable copy = (LootTable) super.clone();
//             copy.items = new ArrayList<>(this.items);
//             return copy;
//         } catch (CloneNotSupportedException e) {
//             throw new RuntimeException("Failed to clone LootTable", e);
//         }
//     }
// }


package com.narxoz.rpg.loot;

import java.util.List;

/**
 * Interface for enemy loot/drop tables in the RPG system.
 * Loot tables must be clonable for Prototype support.
 */
public interface LootTable {

    /** Returns a list of item names that can be dropped. */
    List<String> getItems();

    /** Returns the expected gold dropped. */
    int getGoldDrop();

    /** Returns the expected experience awarded. */
    int getExperienceDrop();

    /** Human-friendly summary of the loot table. */
    String getLootInfo();

    /** Returns a deep copy of this loot table. */
    LootTable clone();

}
