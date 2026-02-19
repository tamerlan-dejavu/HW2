package com.narxoz.rpg.abstractFactory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.ShadowAbility.DarkNova;
import com.narxoz.rpg.combat.ShadowAbility.ShadowStrike;
import com.narxoz.rpg.combat.ShadowAbility.Vanish;
import com.narxoz.rpg.loot.ShadowLootTable;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.List;
import com.narxoz.rpg.behavior.AIBehavior;
import com.narxoz.rpg.behavior.TacticalBehavior;

public class ShadowComponentFactory implements ComponentsFactory{
    ShadowLootTable lootTable = new ShadowLootTable();
    @Override
    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new DarkNova("Dark Nova"));
        list.add(new ShadowStrike("Shadow Strike"));
        list.add(new Vanish("Vanish"));
        return list;
    }

    public List<Ability> createAbility(String abilityName) {
        List<Ability> list = new ArrayList<>();
        switch (abilityName) {
            case "Dark Nova":
                list.add(new DarkNova(abilityName));
                break;
            case "Shadow Strike":
                list.add(new ShadowStrike(abilityName));
                break;
            case "Vanish":
                list.add(new Vanish(abilityName));
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
        return new TacticalBehavior("Shadow");
    }

    @Override
    public void displayComponents() {
        System.out.println("Shadow Component Factory:");
        System.out.println("- Abilities: Dark Nova, Shadow Strike, Vanish");
        System.out.println("- Loot Table: " + lootTable.getLootInfo());
        System.out.println("- AI Behavior: " + createAIBehavior().getDescription());
        System.out.println("Gold Drop: " + lootTable.getGoldDrop() + " | Experience Drop: " + lootTable.getExperienceDrop());
        System.out.println("-----------------------------");
        System.out.println(" ");
    }

    public void displayCreatedComponents(List<Ability> abilities) {
        System.out.println("Shadow Component Factory (Custom Batch):");
        System.out.println("- Ability(ies): " + abilities.stream().map(Ability::getName).reduce((a, b) -> a + ", " + b).orElse("No Abilities"));
        System.out.println("- Loot Table: " + lootTable.getLootInfo());
        System.out.println("- AI Behavior: " + createAIBehavior().getDescription());
        System.out.println("-----------------------------");
        System.out.println(" ");
    }
}
