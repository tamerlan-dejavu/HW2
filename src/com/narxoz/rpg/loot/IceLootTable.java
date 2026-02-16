package com.narxoz.rpg.loot;

import java.util.List;

public class IceLootTable extends LootTable {
    public IceLootTable(int goldDrop, int experienceDrop) {
        super(goldDrop, experienceDrop);
        this.items.addAll(List.of("Ice gem", "Frost scale"));
    }

    @Override
    public void displayLoot() {
        System.out.println("--- Ice Loot Table ---");
        System.out.println("Items: " + getItems());
        System.out.println("Gold: " + goldDrop + " | Exp: " + experienceDrop);
    }
}

// public class IceLootTable implements LootTable {
//     protected List<String> items;
//     protected int goldDrop;
//     protected int experienceDrop;

//     public IceLootTable( int goldDrop, int experienceDrop) {
//         this.items = List.of("Ice gem", "Frost scale");
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
//         System.out.println("Ice Loot Table:");
//         System.out.println("Items: " + this.items);
//         System.out.println("Gold Drop: " + this.goldDrop);
//         System.out.println("Experience Drop: " + this.experienceDrop);
//     }

//     @Override
//     public List<String> getItems() {
//         return this.items;
//     }



//     @Override
//     public IceLootTable clone() {
//         try {
//             return (IceLootTable) super.clone();
//         } 
//         catch (CloneNotSupportedException e) {
//             throw new AssertionError();
//         }
//     }
// }
