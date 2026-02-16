package com.narxoz.rpg.loot;

import java.util.List;

public class ShadowLootTable extends LootTable {
    public ShadowLootTable(int goldDrop, int experienceDrop) {
        super(goldDrop, experienceDrop);
        this.items.addAll(List.of("Shadow gem", "Dark essence"));
    }

    @Override
    public void displayLoot() {
        System.out.println("--- Shadow Loot Table ---");
        System.out.println("Items: " + getItems());
        System.out.println("Gold: " + goldDrop + " | Exp: " + experienceDrop);
    }
}

// public class ShadowLootTable  implements LootTable {
//     protected List<String> items;
//     protected int goldDrop;
//     protected int experienceDrop;

//     public ShadowLootTable( int goldDrop, int experienceDrop) {
//         this.items = List.of("Shadow gem", "Dark essence");
//         this.goldDrop = goldDrop;
//         this.experienceDrop = experienceDrop;
//     }

//     @Override
//     public int getGoldDrop() {
//         return this.goldDrop;
//     }

//     @Override
//     public int getExperienceDrop() {
//         return this.experienceDrop;
//     }

//     @Override
//     public void displayLoot() {
//         System.out.println("Fire Loot Table:");
//         System.out.println("Items: " + this.items);
//         System.out.println("Gold Drop: " + this.goldDrop);
//         System.out.println("Experience Drop: " + this.experienceDrop);
//     }

//     @Override
//     public List<String> getItems() {
//         return this.items;
//     }



//     @Override
//     public ShadowLootTable clone() {
//         try {
//             return (ShadowLootTable) super.clone();
//         } 
//         catch (CloneNotSupportedException e) {
//             throw new AssertionError();
//         }
//     }
// }
