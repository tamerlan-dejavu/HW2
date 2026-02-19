package com.narxoz.rpg;

import java.util.List;

import com.narxoz.rpg.builder.BasicBuilder;
import com.narxoz.rpg.builder.BossBuilder;
import com.narxoz.rpg.builder.EnemyBuilder;
import com.narxoz.rpg.builder.EnemyDirector;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility.FlameBreath;
import com.narxoz.rpg.combat.FireAbility.FireShield;
import com.narxoz.rpg.combat.FireAbility.MeteorStorm;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.bossEnemy.DemonLord;
import com.narxoz.rpg.enemy.bossEnemy.Dragon;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.abstractFactory.ComponentsFactory;
import com.narxoz.rpg.abstractFactory.FireComponentFactory;
import com.narxoz.rpg.abstractFactory.IceComponentFactory;
import com.narxoz.rpg.abstractFactory.ShadowComponentFactory;
import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.enemy.EnemyType;
import com.narxoz.rpg.builder.BasicBuilder;



/**
 * Main demonstration class for the RPG Enemy System.
 *
 * ============================================================
 * CREATIONAL PATTERNS CAPSTONE
 * ============================================================
 *
 * This demo must showcase ALL FOUR creational design patterns
 * working together in one unified system:
 *
 *   1. ABSTRACT FACTORY — Create themed enemy component families
 *   2. BUILDER          — Construct complex enemies step-by-step
 *   3. FACTORY METHOD   — Embedded in Builder.build() and Director
 *   4. PROTOTYPE        — Clone enemies into variants efficiently
 *
 * The patterns work together in a pipeline:
 *
 *   Abstract Factory (themed components)
 *          |
 *          v
 *   Builder (assembles enemy from components)
 *          |
 *          v  <-- Factory Method: build() produces the Enemy
 *   Prototype (clones built enemy into variants)
 *
 * ============================================================
 * YOUR TASKS:
 * ============================================================
 *
 * Your Main.java should demonstrate each pattern clearly,
 * then show them working together. Follow the structure below.
 *
 * Expected output flow:
 *   Part 1: Abstract Factory creates themed components
 *   Part 2: Builder constructs complex enemies
 *   Part 3: Prototype clones enemies into variants
 *   Part 4: Full pipeline — all patterns integrated
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Enemy System - Creational Patterns Capstone ===\n");



        System.out.println("============================================");
        System.out.println("PART 1: ABSTRACT FACTORY - Themed Components");
        System.out.println("============================================\n");

        ComponentsFactory fireFactory = new FireComponentFactory();
        List<Ability> fireAbilities = fireFactory.createAbilities();
        LootTable fireLoot = fireFactory.createLootTable(); 
        fireFactory.displayComponents();

        ComponentsFactory iceFactory = new IceComponentFactory();
        List<Ability> iceAbilities = iceFactory.createAbilities();
        LootTable iceLoot = iceFactory.createLootTable(); 
        iceFactory.displayComponents();

        ComponentsFactory shadowFactory = new ShadowComponentFactory();
        List<Ability> shadowAbilities = shadowFactory.createAbilities();
        LootTable shadowLoot = shadowFactory.createLootTable(); 
        shadowFactory.displayComponents();

        ComponentsFactory fireFactoryOne = new FireComponentFactory();
        List<Ability> fireAbilitiesOne = fireFactoryOne.createAbility("Flame Breath");
        LootTable fireLootOne = fireFactoryOne.createLootTable(); 
        fireFactoryOne.displayCreatedComponents(fireAbilitiesOne);

        ComponentsFactory iceFactoryOne = new IceComponentFactory();
        List<Ability> iceAbilitiesOne = iceFactoryOne.createAbility("Blizzard");
        LootTable iceLootOne = iceFactoryOne.createLootTable(); 
        iceFactoryOne.displayCreatedComponents(iceAbilitiesOne);

        ComponentsFactory shadowFactoryOne = new ShadowComponentFactory();
        List<Ability> shadowAbilitiesOne = shadowFactoryOne.createAbility("Dark Nova");
        LootTable shadowLootOne = shadowFactoryOne.createLootTable(); 
        shadowFactoryOne.displayCreatedComponents(shadowAbilitiesOne);
        

        System.out.println("============================================");
        System.out.println("PART 2: BUILDER - Complex Enemy Construction");
        System.out.println("============================================\n");

        // EnemyBuilder builder = new BossBuilder(new Dragon());
        // Enemy dragon = builder
        //     .setName("Ancient Fire Dragon")
        //     .setHealth(50000)
        //     .setDamage(500)
        //     .setDefense(200)
        //     .setSpeed(50)
        //     .setElement(EnemyType.FIRE)
        //     .addAbility(new FlameBreath("Flame Breath"))
        //     .addAbility(new FireShield("Fire Shield"))
        //     .addAbility(new MeteorStorm("Meteor Storm"))
        //     .addPhase(1, 50000)
        //     .addPhase(2, 30000)
        //     .addPhase(3, 15000)
        //     .setLootTable(fireFactory.createLootTable())
        //     .setAI(BehaviorTypes.AGGRESSIVE)
        //     .build();
        // dragon.displayInfo();

        

        // ============================================================
        // PART 3: PROTOTYPE PATTERN
        // ============================================================
        // TODO: Create a template registry and populate it
        //   EnemyRegistry registry = new EnemyRegistry();
        //   registry.registerTemplate("goblin", baseGoblin);
        //   registry.registerTemplate("dragon", baseDragon);
        //
        // TODO: Clone enemies to create difficulty variants
        //   Enemy eliteGoblin = registry.createFromTemplate("goblin");
        //   eliteGoblin.multiplyStats(2.0);  // 2x stats
        //
        // TODO: Clone enemies to create elemental variants
        //   Enemy fireDragon = registry.createFromTemplate("dragon");
        //   fireDragon.setElement("FIRE");
        //   fireDragon.setAbilities(fireFactory.createAbilities());
        //
        // TODO: Prove deep copy works!
        //   Modify cloned enemy's abilities.
        //   Show that the original template is UNCHANGED.
        //
        // Think: What would happen with shallow copy here?

        System.out.println("============================================");
        System.out.println("PART 3: PROTOTYPE - Enemy Cloning & Variants");
        System.out.println("============================================\n");

        // Your Prototype demonstration here...


        // ============================================================
        // PART 4: ALL PATTERNS WORKING TOGETHER
        // ============================================================
        // TODO: Show the full pipeline
        //
        // Step 1: Abstract Factory creates Shadow components
        //   EnemyComponentFactory shadowFactory = new ShadowComponentFactory();
        //
        // Step 2: Builder assembles Demon Lord with Shadow components
        //   Enemy demonLord = new BossEnemyBuilder()
        //       .setName("Demon Lord")
        //       .setAbilities(shadowFactory.createAbilities())
        //       .setLootTable(shadowFactory.createLootTable())
        //       .build();
        //
        // Step 3: Register as Prototype template
        //   registry.registerTemplate("demon-lord", demonLord);
        //
        // Step 4: Clone variants
        //   Enemy greaterDemon = registry.createFromTemplate("demon-lord");
        //   greaterDemon.multiplyStats(2.0);
        //
        // Display all variants showing each pattern's contribution!

        System.out.println("============================================");
        System.out.println("PART 4: ALL PATTERNS WORKING TOGETHER");
        System.out.println("============================================\n");

        // Your integration demonstration here...


        // ============================================================
        // SUMMARY
        // ============================================================
        System.out.println("============================================");
        System.out.println("PATTERN SUMMARY");
        System.out.println("============================================");
        System.out.println();
        // TODO: Print a summary showing which patterns were demonstrated
        // Example:
        // System.out.println("Abstract Factory: Themed component families (Fire, Ice, Shadow)");
        // System.out.println("Builder: Complex step-by-step enemy construction");
        // System.out.println("Factory Method: Embedded in Builder.build() and Director");
        // System.out.println("Prototype: Efficient template cloning with deep copy");

        System.out.println("\n=== Demo Complete ===");
    }

    // TODO: Add helper methods as needed
    // Consider:
    // - displayEnemyDetails(Enemy enemy)
    // - demonstrateDeepCopy(Enemy original, Enemy clone)
    // - createThemeDemo(EnemyComponentFactory factory, String themeName)
}
