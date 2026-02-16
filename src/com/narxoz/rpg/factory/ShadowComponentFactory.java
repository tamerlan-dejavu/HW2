package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.ShadowAbility.ShadowStrike;
import com.narxoz.rpg.combat.ShadowAbility.Vanish;
import com.narxoz.rpg.combat.ShadowAbility.DarkNova;
import com.narxoz.rpg.loot.ShadowLootTable;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;

public class ShadowComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        return List.of(
            new ShadowStrike("Shadow Strike"),
            new Vanish("Vanish"),
            new DarkNova("Dark Nova")
        );
    }

    @Override
    public LootTable createLootTable() {
        return new ShadowLootTable(120, 400);
    }

    @Override
    public String createAIBehavior() {
        return "TACTICAL";
    }
}
