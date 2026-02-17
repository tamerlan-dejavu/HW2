package com.narxoz.rpg.builder;

import com.narxoz.rpg.behavior.AIBehavior;
import com.narxoz.rpg.behavior.BehaviorTypes;
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
    EnemyBuilder setAI(BehaviorTypes aiBehavior);
    EnemyBuilder addPhase(int phaseNumber, int triggerHealth);
    EnemyBuilder setLootTable(LootTable lootTable);
    Enemy build();
    
}
