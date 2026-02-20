package com.narxoz.rpg.builder;

import java.util.List;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.EnemyType;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.behavior.BehaviorTypes;

public interface EnemyBuilder {
    EnemyBuilder setName(String name);
    EnemyBuilder setHealth(int health);
    EnemyBuilder setDamage(int damage);
    EnemyBuilder setDefense(int defense);
    EnemyBuilder setSpeed(int speed);
    EnemyBuilder setElement(EnemyType element);
    EnemyBuilder addAbility(Ability ability);
    EnemyBuilder setAbilities(List<Ability> abilities);
    EnemyBuilder setAI(BehaviorTypes aiBehavior);
    // EnemyBuilder addPhase(int phaseNumber, int triggerHealth);
    EnemyBuilder setLootTable(LootTable lootTable);
    Enemy build();  
}
