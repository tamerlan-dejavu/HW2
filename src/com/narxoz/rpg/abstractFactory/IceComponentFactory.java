package com.narxoz.rpg.abstractFactory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility.FlameBreath;
import com.narxoz.rpg.combat.FireAbility.MeteorStorm;
import com.narxoz.rpg.combat.FireAbility.FireShield;
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
        list.add(new FlameBreath("Blizzard"));
        list.add(new FireShield("Ice Shield"));
        list.add(new MeteorStorm("Frost Breath"));
        return list;
    }

    public List<Ability> createAbility(String abilityName) {
        List<Ability> list = new ArrayList<>();
        switch (abilityName) {
            case "Blizzard":
                list.add(new FlameBreath(abilityName));
                break;
            case "Ice Shield":
                list.add(new FireShield(abilityName));
                break;
            case "Frost Breath":
                list.add(new MeteorStorm(abilityName));
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
    }
}
