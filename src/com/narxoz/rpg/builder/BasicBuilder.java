package com.narxoz.rpg.builder;

import java.util.*;

import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.EnemyType;
import com.narxoz.rpg.enemy.basicEnemy.Goblin;
import com.narxoz.rpg.loot.LootTable;


public class BasicBuilder implements EnemyBuilder{
    // public Enemy enemy;

    // public BasicBuilder(Enemy enemy) {
    //     this.enemy = enemy;
    // }

    // public BasicBuilder(){
    //     // this.enemy = new Enemy();
    // }

    // @Override
    // public EnemyBuilder setName(String name) {
    //     enemy.setName(name);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder setHealth(int health) {
    //     enemy.setHealth(health);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder setDamage(int damage) {
    //     enemy.setDamage(damage);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder setDefense(int defense) {
    //     enemy.setDefense(defense);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder setSpeed(int speed) {
    //     enemy.setSpeed(speed);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder setElement(EnemyType element) {
    //     enemy.setElement(element);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder addAbility(Ability ability) {
    //     enemy.getAbilities().add(ability);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder addPhase(int phaseNumber, int triggerHealth) {
    //     enemy.getPhases().put(phaseNumber, triggerHealth);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder setLootTable(LootTable lootTable) {
    //     enemy.setLootTable(lootTable);
    //     return this;
    // }

    // @Override
    // public EnemyBuilder setAI(BehaviorTypes aiBehavior) {
    //     enemy.setAiBehavior(aiBehavior);
    //     return this;
    // }

    // @Override
    // public Enemy build() {
    //     return enemy;
    // }
    public Enemy enemy;
    protected String name;
    protected int health;
    protected int damage ;
    protected int defense ;
    protected int speed ;
    protected EnemyType element;
    protected List<Ability> abilities = new ArrayList<>();
    protected LootTable lootTable;
    protected BehaviorTypes aiBehavior;

    public BasicBuilder() {
        this.enemy = new Goblin();
    }

    @Override
    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public EnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public EnemyBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    @Override
    public EnemyBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public EnemyBuilder setElement(EnemyType element) {
        this.element = element;
        return this;
    }

    @Override
    public EnemyBuilder addAbility(Ability ability) {
        if (ability != null) {
            this.abilities.add(ability);
        }
        return this;
    }

    @Override
    public EnemyBuilder setAbilities(List<Ability> abilities) {
        if (abilities != null) {
            this.abilities = new ArrayList<>(abilities);
        }
        return this;
    }

    @Override
    public EnemyBuilder setLootTable(LootTable lootTable) {
        this.lootTable = lootTable;
        return this;
    }

    // @Override
    // public EnemyBuilder setAI(BehaviorTypes aiBehavior) {
    //     this.aiBehavior = aiBehavior;
    //     return this;
    // }

    // @Override
    // public EnemyBuilder addPhase(int phaseNumber, int triggerHealth) {
    //     this.phases.put(phaseNumber, triggerHealth);
    //     return this;
    // }

    @Override
    public Enemy build() {
        enemy.setName(this.name);
        enemy.setHealth(this.health);
        enemy.setDamage(this.damage);
        enemy.setDefense(this.defense);
        enemy.setSpeed(this.speed);
        enemy.setElement(this.element);
        enemy.setAbilities(this.abilities);
        enemy.setLootTable(this.lootTable);
        enemy.setAiBehavior(this.aiBehavior);
        return enemy;
    }

    @Override
    public EnemyBuilder setAI(BehaviorTypes aiBehavior) {
        this.aiBehavior = aiBehavior;
        return this;
    }

}
