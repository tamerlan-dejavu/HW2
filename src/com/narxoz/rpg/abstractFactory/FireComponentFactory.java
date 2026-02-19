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
    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new FlameBreath("Flame Breath"));
        list.add(new FireShield("Fire Shield"));
        list.add(new MeteorStorm("Meteor Storm"));
        return list;
    }

    public List<Ability> createAbility(String abilityName) {
        List<Ability> list = new ArrayList<>();
        switch (abilityName) {
            case "Flame Breath":
                list.add(new FlameBreath(abilityName));
                break;
            case "Fire Shield":
                list.add(new FireShield(abilityName));
                break;
            case "Meteor Storm":
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
        return new AggressiveBehavior("Fire");
    }

    @Override
    public void displayComponents() {
        System.out.println("Fire Component Factory:");
        System.out.println("- Abilities: " + createAbilities().stream().map(Ability::getName).reduce((a, b) -> a + ", " + b).orElse("No Abilities"));
        System.out.println("- Loot Table: " + lootTable.getLootInfo());
        System.out.println("- AI Behavior: " + createAIBehavior().getDescription());
        System.out.println("Gold Drop: " + lootTable.getGoldDrop() + " | Experience Drop: " + lootTable.getExperienceDrop());
        System.out.println("-----------------------------");
        System.out.println(" ");
    }
    public void displayCreatedComponents(List<Ability> abilities) {
        System.out.println("Fire Component Factory (Custom Batch):");
        System.out.println("- Ability(ies): " + abilities.stream().map(Ability::getName).reduce((a, b) -> a + ", " + b).orElse("No Abilities"));
        System.out.println("- Loot Table: " + lootTable.getLootInfo()); 
        System.out.println("- AI Behavior: " + createAIBehavior().getDescription());
        System.out.println("-----------------------------");
        System.out.println(" ");
    }
}