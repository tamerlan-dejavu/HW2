package com.narxoz.rpg.abstractFactory;

import com.narxoz.rpg.behavior.AIBehavior;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;

public interface ComponentsFactory {
    List<Ability> createAbility(String abilityName); 
    LootTable createLootTable();
    AIBehavior createAIBehavior();
    void displayComponents();
}
