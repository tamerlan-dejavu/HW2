// package com.narxoz.rpg.loot;

// import java.util.List;

// public class ShadowLootTable extends LootTable {
//     public ShadowLootTable(int goldDrop, int experienceDrop) {
//         super(goldDrop, experienceDrop);
//         this.items.addAll(List.of("Shadow gem", "Dark essence"));
//     }

//     @Override
//     public void displayLoot() {
//         System.out.println("--- Shadow Loot Table ---");
//         System.out.println("Items: " + getItems());
//         System.out.println("Gold: " + goldDrop + " | Exp: " + experienceDrop);
//     }
// }

// // public class ShadowLootTable  implements LootTable {
// //     protected List<String> items;
// //     protected int goldDrop;
// //     protected int experienceDrop;

// //     public ShadowLootTable( int goldDrop, int experienceDrop) {
// //         this.items = List.of("Shadow gem", "Dark essence");
// //         this.goldDrop = goldDrop;
// //         this.experienceDrop = experienceDrop;
// //     }

// //     @Override
// //     public int getGoldDrop() {
// //         return this.goldDrop;
// //     }

// //     @Override
// //     public int getExperienceDrop() {
// //         return this.experienceDrop;
// //     }

// //     @Override
// //     public void displayLoot() {
// //         System.out.println("Fire Loot Table:");
// //         System.out.println("Items: " + this.items);
// //         System.out.println("Gold Drop: " + this.goldDrop);
// //         System.out.println("Experience Drop: " + this.experienceDrop);
// //     }

// //     @Override
// //     public List<String> getItems() {
// //         return this.items;
// //     }



// //     @Override
// //     public ShadowLootTable clone() {
// //         try {
// //             return (ShadowLootTable) super.clone();
// //         } 
// //         catch (CloneNotSupportedException e) {
// //             throw new AssertionError();
// //         }
// //     }
// // }


package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class ShadowLootTable implements LootTable {

    private final List<String> items;
    private final int gold;
    private final int experience;

    public ShadowLootTable() {
        this.items = new ArrayList<>();
        items.add("Shadow Gem");
        items.add("Dark Essence");
        items.add("Shadow Rune");
        this.gold = 160;
        this.experience = 320;
    }

    private ShadowLootTable(List<String> items, int gold, int experience) {
        this.items = items;
        this.gold = gold;
        this.experience = experience;
    }

    @Override public List<String> getItems() { return new ArrayList<>(items); }
    @Override public int getGoldDrop() { return gold; }
    @Override public int getExperienceDrop() { return experience; }
    @Override public String getLootInfo() { return "Shadow Loot: " + items.toString(); }

    @Override public LootTable clone() {
        return new ShadowLootTable(new ArrayList<>(this.items), this.gold, this.experience);
    }

}
