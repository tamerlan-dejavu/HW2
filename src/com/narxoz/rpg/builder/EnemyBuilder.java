package com.narxoz.rpg.builder;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public interface EnemyBuilder {
    EnemyBuilder setName(String name);
    EnemyBuilder setHealth(int health);
    EnemyBuilder setDamage(int damage);
    EnemyBuilder setDefense(int defense);
    EnemyBuilder setSpeed(int speed);
    EnemyBuilder setElement(String element);
    EnemyBuilder addAbility(Ability ability);
    EnemyBuilder addPhase(int phaseNumber, int triggerHealth);
    EnemyBuilder setLootTable(LootTable lootTable);
    EnemyBuilder setAI(String aiBehavior);
    Enemy build();
}
