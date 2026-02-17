package com.narxoz.rpg.builder;

import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.DragonBoss;
import com.narxoz.rpg.loot.LootTable;


public class DragonBossBuilder implements EnemyBuilder{
    private Enemy enemy;

    public DragonBossBuilder(){
        this.enemy = new DragonBoss();
    }

    @Override
    public EnemyBuilder setName(String name) {
        enemy.setName(name);
        return this;
    }

    @Override
    public EnemyBuilder setHealth(int health) {
        enemy.setHealth(health);
        return this;
    }

    @Override
    public EnemyBuilder setDamage(int damage) {
        enemy.setDamage(damage);
        return this;
    }

    @Override
    public EnemyBuilder setDefense(int defense) {
        enemy.setDefense(defense);
        return this;
    }

    @Override
    public EnemyBuilder setSpeed(int speed) {
        enemy.setSpeed(speed);
        return this;
    }

    @Override
    public EnemyBuilder setElement(String element) {
        enemy.setElement(element);
        return this;
    }

    @Override
    public EnemyBuilder addAbility(Ability ability) {
        enemy.getAbilities().add(ability);
        return this;
    }

    @Override
    public EnemyBuilder addPhase(int phaseNumber, int triggerHealth) {
        enemy.getPhases().put(phaseNumber, triggerHealth);
        return this;
    }

    @Override
    public EnemyBuilder setLootTable(LootTable lootTable) {
        enemy.setLootTable(lootTable);
        return this;
    }

    @Override
    public EnemyBuilder setAI(BehaviorTypes aiBehavior) {
        enemy.setAiBehavior(aiBehavior);
        return this;
    }

    @Override
    public Enemy build() {
        return enemy;
    }
    
    
}
