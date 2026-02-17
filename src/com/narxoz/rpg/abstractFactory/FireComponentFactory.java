package com.narxoz.rpg.abstractFactory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility.FlameBreath;
import com.narxoz.rpg.combat.FireAbility.MeteorStorm;
import com.narxoz.rpg.combat.FireAbility.FireShield;
import com.narxoz.rpg.loot.FireLootTable;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;
import com.narxoz.rpg.behavior.AIBehavior;
import com.narxoz.rpg.behavior.AggressiveBehavior;


public class FireComponentFactory implements ComponentsFactory{
    FireLootTable lootTable = new FireLootTable();
    @Override
    public List<Ability> createAbility(String abilityName) {
        List<Ability> list = new ArrayList<>();
        list.add(new FlameBreath("Flame Breath"));
        list.add(new FireShield("Fire Shield"));
        list.add(new MeteorStorm("Meteor Storm"));
        return list;
    }

    @Override
    public LootTable createLootTable() {
        return lootTable;
    }

    @Override
    public AIBehavior createAIBehavior() {
        return new AggressiveBehavior("Fire");
    }

    @Override
    public void displayComponents() {
        System.out.println("Fire Component Factory:");
        System.out.println("- Abilities: Flame Breath, Fire Shield, Meteor Storm");
        System.out.println("- Loot Table: " + lootTable.getLootInfo());
        System.out.println("- AI Behavior: AggressiveBehavior (Fire)");
        System.out.println("Gold Drop: " + lootTable.getGoldDrop() + " | Experience Drop: " + lootTable.getExperienceDrop());
        System.out.println("-----------------------------");
        System.out.println(" ");
    }
}