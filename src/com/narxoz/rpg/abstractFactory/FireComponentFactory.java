package com.narxoz.rpg.abstractFactory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility.FlameBreath;
import com.narxoz.rpg.combat.FireAbility.MeteorStorm;
import com.narxoz.rpg.combat.FireAbility.FireShield;
import com.narxoz.rpg.loot.FireLootTable;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.behavior.AIBehavior;
import com.narxoz.rpg.behavior.AggressiveBehavior;


public class FireComponentFactory implements СomponentsFactory{

    public LootTable createLootTable(int goldDrop, int expDrop) {
        return new FireLootTable(goldDrop, expDrop);
    }

    public AIBehavior createAIBehavior() {
        return new AggressiveBehavior("Fire");
    }

    public Ability createAbility(String abilityName) {
        return switch (abilityName) {
            case "Flame Breath" -> new FlameBreath(abilityName);
            case "Meteor Storm" -> new MeteorStorm(abilityName);
            case "Fire Shield" -> new FireShield(abilityName);
            default -> throw new IllegalArgumentException("Unknown ability: " + abilityName);
        };
    }
}