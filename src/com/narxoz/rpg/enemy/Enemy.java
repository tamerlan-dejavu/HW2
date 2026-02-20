package com.narxoz.rpg.enemy;

import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;

public abstract class Enemy implements Cloneable{
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected int speed;
    protected EnemyType element;
    protected List<Ability> abilities = new ArrayList<>();
    protected Map<Integer, Integer> phases = new HashMap<>();
    protected LootTable lootTable;
    protected BehaviorTypes aiBehavior;
    protected boolean canFly;
    protected boolean hasBreathAttack;
    protected int wingspan;

    public String getName() {return name;}
    public int getHealth() {return health;}
    public int getDamage() {return damage;}
    public int getDefense() {return defense;}
    public int getSpeed() {return speed;}
    public EnemyType getElement() { return element;}
    public List<Ability> getAbilities() {return abilities;}
    public Map<Integer, Integer> getPhases() {return phases;}
    public LootTable getLootTable() {return lootTable;}
    public BehaviorTypes getAiBehavior() {return aiBehavior;}
    public boolean getCanFly() {return canFly;}
    public boolean getHasBreathAttack() {return hasBreathAttack;}
    public int getWingspan() {return wingspan;}

    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }
    public void setDamage(int damage) { this.damage = damage; }
    public void setDefense(int defense) { this.defense = defense; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setElement(EnemyType element) { this.element = element; }
    public void setAbilities(List<Ability> abilities) { this.abilities = abilities; }
    public void addPhase(Map<Integer, Integer> phases) { this.phases = phases; }
    public void setLootTable(LootTable lootTable) { this.lootTable = lootTable; }
    public void setAiBehavior(BehaviorTypes aiBehavior) { this.aiBehavior = aiBehavior; }
    public void setCanFly(boolean canFly) { this.canFly = canFly; }
    public void setHasBreathAttack(boolean hasBreathAttack) { this.hasBreathAttack = hasBreathAttack; }
    public void setWingspan(int wingspan) { this.wingspan = wingspan; }

    public Enemy() {}

    public void displayInfo() {
        System.out.println("=== " + name + " (RPG Enemy) ===");
        System.out.println("Health: " + health + " | Damage: " + damage + " | Defense: " + defense + " | Speed: " + speed);
        System.out.println("Element: " + element);
        if (abilities != null) {
            System.out.println("Abilities (" + abilities.size() + "):");
            for (Ability ability : abilities) {
                System.out.println("  - " + ability.getName() + " (DMG: " + ability.getDamage() + ")");
            }
        }
        if (phases != null && !phases.isEmpty()) {
            System.out.println("Boss Phases: " + phases.size());
            for (Map.Entry<Integer, Integer> phase : phases.entrySet()) {
                System.out.println("  Phase " + phase.getKey()
                        + ": triggers at " + phase.getValue() + " HP");
            }
        } 
        else System.out.println("Boss Phases: None");
        System.out.println("AI Behavior: " + aiBehavior);
        System.out.println("Can Fly: " + canFly+ " | Breath Attack: " + hasBreathAttack+ " | Wingspan: " + wingspan);
        if (lootTable != null) {
            System.out.println("Loot Table: " + lootTable.getLootInfo() + " | gold drop : " + lootTable.getGoldDrop() + " | exp drop : " + lootTable.getExperienceDrop());
        }
        System.out.println("==============================\n");
        System.out.println(" ");
    }

    protected Enemy(Enemy other) {
        this.name = other.name;
        this.abilities = new ArrayList<>(other.abilities); 
    }

    @Override
    public abstract Enemy clone();
}
