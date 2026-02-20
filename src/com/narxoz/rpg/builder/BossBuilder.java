package com.narxoz.rpg.builder;

import java.util.*;
import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.EnemyType;
import com.narxoz.rpg.enemy.bossEnemy.Dragon;
import com.narxoz.rpg.loot.LootTable;


public class BossBuilder extends BasicBuilder{
    protected Map<Integer, Integer> phases = new HashMap<>();
    protected boolean canFly;
    protected boolean hasBreathAttack;
    protected int wingspan;

    public BossBuilder(Enemy enemy) {
        this.enemy = enemy;
    }

    public BossBuilder() {
        this.enemy = new Dragon();
    }

    @Override
    public BossBuilder setName(String name) {
        enemy.setName(name);
        return this;
    }

    @Override
    public BossBuilder setHealth(int health) {
        enemy.setHealth(health);
        return this;
    }

    @Override
    public BossBuilder setDamage(int damage) {
        enemy.setDamage(damage);
        return this;
    }

    @Override
    public BossBuilder setDefense(int defense) {
        enemy.setDefense(defense);
        return this;
    }

    @Override
    public BossBuilder setSpeed(int speed) {
        enemy.setSpeed(speed);
        return this;
    }

    @Override
    public BossBuilder setElement(EnemyType element) {
        enemy.setElement(element);
        return this;
    }

    @Override
    public BossBuilder addAbility(Ability ability) {
        enemy.getAbilities().add(ability);
        return this;
    }

    
    public BossBuilder addPhase(int phaseNumber, int healthThreshold) {
        this.phases.put(phaseNumber, healthThreshold);
        return this;
    }

    @Override
    public BossBuilder setLootTable(LootTable lootTable) {
        enemy.setLootTable(lootTable);
        return this;
    }

    
    public BossBuilder setAI(BehaviorTypes aiBehavior) {
        enemy.setAiBehavior(aiBehavior);
        return this;
    }

    public BossBuilder setCanFly(boolean canFly){
        enemy.setCanFly(canFly);
        return this;
    }

    public BossBuilder setHasBreathAttack(boolean hasBreathAttack){
        enemy.setHasBreathAttack(hasBreathAttack);
        return this;
    }

    @Override
    public BossBuilder setAbilities(List<Ability> abilities) {
        if (abilities != null) {
            this.abilities = new ArrayList<>(abilities);
        }
        return this;
    }

    public BossBuilder setWingspan(int wingspan){
        this.wingspan = wingspan;
        return this;
    }
    
    @Override
    public Enemy build() {
        enemy.addPhase(this.phases);
        enemy.setWingspan(this.wingspan);
        enemy.setAbilities(this.abilities);
        return enemy;
    }
    
}
