package com.narxoz.rpg;

import java.util.List;
import com.narxoz.rpg.builder.BasicBuilder;
import com.narxoz.rpg.builder.BossBuilder;
import com.narxoz.rpg.builder.EnemyDirector;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireAbility.FlameBreath;
import com.narxoz.rpg.combat.ShadowAbility.ShadowStrike;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.abstractFactory.ComponentsFactory;
import com.narxoz.rpg.abstractFactory.FireComponentFactory;
import com.narxoz.rpg.abstractFactory.IceComponentFactory;
import com.narxoz.rpg.abstractFactory.ShadowComponentFactory;
import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.enemy.EnemyType;
import com.narxoz.rpg.enemy.bossEnemy.Dragon;
import com.narxoz.rpg.prototype.Registry;

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

        Enemy fireDragon = new BossBuilder()
            .setName("Ancient Fire Dragon")
            .setHealth(50000)
            .setDamage(500)
            .setDefense(200)
            .setSpeed(50)
            .setElement(EnemyType.FIRE)
            .setAbilities(fireAbilities)
            .setLootTable(fireLoot)
            .addPhase(1, 50000)
            .addPhase(2, 30000)
            .addPhase(3, 15000)
            .setCanFly(true)
            .setHasBreathAttack(true)
            .setWingspan(20)
            .addAbility(new FlameBreath("Fire Breath"))
            .setAI(BehaviorTypes.AGGRESSIVE)
            .build();
        fireDragon.displayInfo(EnemyType.BOSS);

        Enemy mefistofel = new BossBuilder()
            .setName("Hell Demon")
            .setHealth(50000)
            .setDamage(500)
            .setDefense(200)
            .setSpeed(50)
            .setElement(EnemyType.ICE)
            .setAbilities(iceAbilities)
            .setLootTable(iceLoot)
            .addPhase(1, 50000)
            .addPhase(2, 30000)
            .addPhase(3, 15000)
            .setCanFly(true)
            .setHasBreathAttack(true)
            .setWingspan(20)
            .build();
        mefistofel.displayInfo(EnemyType.BOSS);

        Enemy shadowOrc = new BasicBuilder()
            .setName("Shadow Orc")
            .setHealth(500)
            .setDamage(40)
            .setDefense(15)
            .setSpeed(20)
            .setElement(EnemyType.SHADOW)
            .setAbilities(shadowAbilities)
            .setLootTable(shadowLoot)
            .build();
        shadowOrc.displayInfo(EnemyType.BASIC);


        EnemyDirector director = new EnemyDirector();
        Enemy gobliN = director.createMinion(fireFactory);
        gobliN.displayInfo(EnemyType.BASIC);


        
        System.out.println("============================================");
        System.out.println("PART 3: PROTOTYPE - Enemy Cloning & Variants");
        System.out.println("============================================\n");

        Registry registry = new Registry();
        registry.registerTemplate("fire-dragon", fireDragon);
        registry.registerTemplate("hell-demon", mefistofel);
        registry.registerTemplate("shadow-orc", shadowOrc);
        registry.registerTemplate("goblin", gobliN);

        System.out.println("Registered templates: " + registry.listTemplates());

        Enemy cloneGoblin = registry.createFromTemplate("goblin");
        cloneGoblin.setName("Cloned Goblin");
        cloneGoblin.displayInfo(EnemyType.BASIC);


        Enemy eliteDragon = registry.createFromTemplate("fire-dragon");
        eliteDragon.multiplyStats(2.0);
        eliteDragon.displayInfo(EnemyType.BOSS);

        Enemy championDragon = registry.createFromTemplate("fire-dragon");
        championDragon.multiplyStats(5.0);
        championDragon.setAbility(new FlameBreath("Inferno Blast"));
        championDragon.setName("Champion " + championDragon.getName());
        championDragon.displayInfo(EnemyType.BOSS);

        Enemy bossVariant = registry.createFromTemplate("fire-dragon");
        bossVariant.multiplyStats(10.0);
        bossVariant.addPhase(4, 5000);
        bossVariant.setName("BossVariant " + bossVariant.getName());
        bossVariant.displayInfo(EnemyType.BOSS);

        Enemy fireGoblinVariant = registry.createFromTemplate("goblin");
        fireGoblinVariant.setElement(EnemyType.FIRE);
        fireGoblinVariant.setAbilities(fireFactory.createAbilities());
        fireGoblinVariant.setName("Fire Goblin");
        fireGoblinVariant.displayInfo(EnemyType.BASIC);



        

        

        System.out.println("============================================");
        System.out.println("PART 4: ALL PATTERNS WORKING TOGETHER");
        System.out.println("============================================\n");

        ComponentsFactory shadowDemonstrationFactory = new ShadowComponentFactory();
        List<Ability> shadowDemonstrationAbilities = shadowDemonstrationFactory.createAbilities();
        LootTable shadowDemonstrationLoot = shadowDemonstrationFactory.createLootTable(); 
        shadowFactory.displayComponents();


        Enemy shadowDragon = new BossBuilder()
            .setName("Ancient Shadow Dragon")
            .setHealth(27000)
            .setDamage(2000)
            .setDefense(1500)
            .setSpeed(30)
            .setElement(EnemyType.SHADOW)
            .setAbilities(shadowDemonstrationAbilities)
            .setLootTable(shadowDemonstrationLoot)
            .addPhase(1, 20000)
            .addPhase(2, 10000)
            .addPhase(3, 5000)
            .setCanFly(true)
            .setHasBreathAttack(true)
            .setWingspan(20)
            .setAI(BehaviorTypes.TACTICAL)
            .build();
        shadowDragon.displayInfo(EnemyType.BOSS);


        Registry registryDemostration = new Registry();
        registryDemostration.registerTemplate("ultimate-shadow-dragon", shadowDragon);
        Enemy ultimateVariant = registryDemostration.createFromTemplate("ultimate-shadow-dragon");
        ultimateVariant.multiplyStats(10.0);
        ultimateVariant.addPhase(4, 2500);
        ultimateVariant.setName("Ultimate Variant " + ultimateVariant.getName());
        ultimateVariant.displayInfo(EnemyType.BOSS);

        System.out.println("============================================");
        System.out.println("PATTERN SUMMARY");
        System.out.println("============================================");
        System.out.println();
        System.out.println("\n=== Demo Complete ===");
    }
}
