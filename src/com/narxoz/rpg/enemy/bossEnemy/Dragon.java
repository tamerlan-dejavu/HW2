package com.narxoz.rpg.enemy.bossEnemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;

import java.util.Map;
import java.util.HashMap;

public class Dragon extends Enemy {
    public Dragon(){} 

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    // public void displayInfo() {
    //     System.out.println("=== " + name + " (Dragon Boss) ===");
    //     System.out.println("Health: " + health + " | Damage: " + damage + " | Defense: " + defense + " | Speed: " + speed);
    //     System.out.println("Element: " + element);
    //     System.out.println("Abilities : " + abilities.size());
    //     for (Ability ability : abilities) {
    //         System.out.println(ability.getName() + ". Damage: " + ability.getDamage());
    //     }
    //     System.out.println("Boss Phases: " + phases.size());
    //     for (Map.Entry<Integer, Integer> phase : phases.entrySet()) {
    //         System.out.println("  Phase " + phase.getKey()+ ": triggers at " + phase.getValue() + " HP");}
    //     System.out.println("AI Behavior: " + aiBehavior);
    //     System.out.println("Can Fly: " + canFly+ " | Breath Attack: " + hasBreathAttack + " | Wingspan: " + wingspan);
    // }

    Dragon(Dragon other) {
        super(other);   
        this.phases = new HashMap<>(other.phases);
    }

    @Override
    public Enemy clone() {
        return new Dragon(this); 
    }

    @Override
    public void attack(Enemy target) {
    }
}
