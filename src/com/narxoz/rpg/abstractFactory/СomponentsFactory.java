package com.narxoz.rpg.abstractFactory;

import com.narxoz.rpg.behavior.AIBehavior;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

public interface СomponentsFactory {
    Ability createAbility(String abilityName); 
    LootTable createLootTable(int goldDrop, int expDrop);
    AIBehavior createAIBehavior();
}
