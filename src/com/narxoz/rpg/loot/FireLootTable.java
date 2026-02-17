// package com.narxoz.rpg.loot;

// import java.util.ArrayList;
// import java.util.List;

// public class FireLootTable extends LootTable {
//     // public FireLootTable(int goldDrop, int experienceDrop) {
//     //     super(goldDrop, experienceDrop);
//     //     this.items.addAll(List.of("Fire gem", "Dragon Scale"));
//     // }

//     // @Override
//     // public void displayLoot() {
//     //     System.out.println("--- Fire Loot Table ---");
//     //     System.out.println("Items: " + getItems());
//     //     System.out.println("Gold: " + goldDrop + " | Exp: " + experienceDrop);
//     // }
//     private final List<String> items;
//     private final int gold;
//     private final int experience;

//     public FireLootTable() {
//         this.items = new ArrayList<>();
//         items.add("Fire Gem");
//         items.add("Dragon Scale");
//         items.add("Flame Rune");
//         this.gold = 150;
//         this.experience = 300;
//     }

//     public FireLootTable(List<String> items, int gold, int experience) {
//         this.items = items;
//         this.gold = gold;
//         this.experience = experience;
//     }

//     @Override public List<String> getItems() { return new ArrayList<>(items); }
//     @Override public int getGoldDrop() { return gold; }
//     @Override public int getExperienceDrop() { return experience; }
//     @Override public String getLootInfo() { return "Fire Loot: " + items.toString(); }

//     @Override public LootTable clone() {
//         return new FireLootTable(new ArrayList<>(this.items), this.gold, this.experience);
//     }
// }


package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class FireLootTable implements LootTable {

    private final List<String> items;
    private final int gold;
    private final int experience;

    public FireLootTable() {
        this.items = new ArrayList<>();
        items.add("Fire Gem");
        items.add("Dragon Scale");
        items.add("Flame Rune");
        this.gold = 150;
        this.experience = 300;
    }

    private FireLootTable(List<String> items, int gold, int experience) {
        this.items = items;
        this.gold = gold;
        this.experience = experience;
    }

    @Override public List<String> getItems() { return new ArrayList<>(items); }
    @Override public int getGoldDrop() { return gold; }
    @Override public int getExperienceDrop() { return experience; }
    @Override public String getLootInfo() { return "Fire Loot: " + items.toString(); }

    @Override public LootTable clone() {
        return new FireLootTable(new ArrayList<>(this.items), this.gold, this.experience);
    }

}
