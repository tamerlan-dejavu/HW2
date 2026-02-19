package com.narxoz.rpg.enemy.basicEnemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;

public class Orc extends Enemy {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private List<Ability> abilities;
    private LootTable lootTable;

    public Orc() {}

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void displayInfo() {
        System.out.println("=== " + name + " (Orc) ===");
        System.out.println("Health: " + health + " | Damage: " + damage
                + " | Defense: " + defense + " | Speed: " + speed);
        System.out.println("Abilities: " + abilities.size() + " ability(ies)");
        if (lootTable != null) {
            System.out.println("Loot items: " + lootTable.getItems());
        }
    }

    private Orc(Orc other) {
        super(other);   
    }

    @Override
    public Enemy clone() {
        return new Orc(this); 
    }

    @Override
    public void attack(Enemy target) {
    }
}
