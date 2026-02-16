package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.IceAbility.FrostBreath;
import com.narxoz.rpg.combat.IceAbility.IceShield;
import com.narxoz.rpg.combat.IceAbility.Blizzard;
import com.narxoz.rpg.loot.IceLootTable;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;

public class IceComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        return List.of(
            new FrostBreath("Frost Breath"),
            new IceShield("Ice Shield"),
            new Blizzard("Blizzard")
        );
    }

    @Override
    public LootTable createLootTable() {
        return new IceLootTable(80, 300);
    }

    @Override
    public String createAIBehavior() {
        return "DEFENSIVE";
    }
}
