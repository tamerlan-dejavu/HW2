package com.narxoz.rpg.abstractFactory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.IceAbility.Blizzard;
import com.narxoz.rpg.combat.IceAbility.FrostBreath;
import com.narxoz.rpg.combat.IceAbility.IceShield;
import com.narxoz.rpg.loot.IceLootTable;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;
import com.narxoz.rpg.behavior.AIBehavior;
import com.narxoz.rpg.behavior.DefensiveBehavior;


public class IceComponentFactory implements ComponentsFactory{
    IceLootTable lootTable = new IceLootTable();
    @Override
    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new Blizzard("Blizzard"));
        list.add(new IceShield("Ice Shield"));
        list.add(new FrostBreath("Frost Breath"));
        return list;
    }

    public List<Ability> createAbility(String abilityName) {
        List<Ability> list = new ArrayList<>();
        switch (abilityName) {
            case "Blizzard":
                list.add(new Blizzard(abilityName));
                break;
            case "Ice Shield":
                list.add(new IceShield(abilityName));
                break;
            case "Frost Breath":
                list.add(new FrostBreath(abilityName));
                break;
            default:
                System.out.println("Ability not found: " + abilityName);
        }
        return list;
    }

    @Override
    public LootTable createLootTable() {
        return lootTable;
    }

    @Override
    public AIBehavior createAIBehavior() {
        return new DefensiveBehavior("Ice");
    }

    @Override
    public void displayComponents() {
        System.out.println("Ice Component Factory:");
        System.out.println("- Abilities: Blizzard, Ice Shield, Frost Breath");
        System.out.println("- Loot Table: " + lootTable.getLootInfo());
        System.out.println("- AI Behavior: " + createAIBehavior().getDescription());
        System.out.println("Gold Drop: " + lootTable.getGoldDrop() + " | Experience Drop: " + lootTable.getExperienceDrop());
        System.out.println("-----------------------------");
        System.out.println(" ");
    }
    public void displayCreatedComponents(List<Ability> abilities) {
        System.out.println("Ice Component Factory (Custom Batch):");
        System.out.println("- Ability(ies): " + abilities.stream().map(Ability::getName).reduce((a, b) -> a + ", " + b).orElse("No Abilities"));
        System.out.println("- Loot Table: " + lootTable.getLootInfo());
        System.out.println("- AI Behavior: " + createAIBehavior().getDescription());
        System.out.println("-----------------------------");
        System.out.println(" ");
    }
}
