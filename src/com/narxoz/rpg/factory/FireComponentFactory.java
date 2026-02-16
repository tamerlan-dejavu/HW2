package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility.FlameBreath;
import com.narxoz.rpg.combat.FireAbility.FireShield;
import com.narxoz.rpg.combat.FireAbility.MeteorStorm;
import com.narxoz.rpg.loot.FireLootTable;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;

public class FireComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        return List.of(
            new FlameBreath("Flame Breath"),
            new FireShield("Fire Shield"),
            new MeteorStorm("Meteor Storm")
        );
    }

    @Override
    public LootTable createLootTable() {
        return new FireLootTable(100, 500);
    }

    @Override
    public String createAIBehavior() {
        return "AGGRESSIVE";
    }
}
