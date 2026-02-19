package com.narxoz.rpg.builder;

import com.narxoz.rpg.abstractFactory.ComponentsFactory;
import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.EnemyType;

public class EnemyDirector {
    private EnemyBuilder builder;

    public EnemyDirector(EnemyBuilder builder) {
        this.builder = builder;
    }

    public Enemy createMinion(ComponentsFactory factory, EnemyType type){
        if (type == EnemyType.FIRE) {
            builder.setName("Fire Minion")
                .setHealth(200)
                .setDamage(10)
                .setDefense(5)
                .setSpeed(15)
                .addAbility(factory.createAbility("Fire Shield").get(0))
                .setAI(BehaviorTypes.AGGRESSIVE)
                .setLootTable(factory.createLootTable());
                return builder.build();
        }
        else if(type == EnemyType.ICE){
            builder.setName("Ice Minion")
                .setHealth(200)
                .setDamage(10)
                .setDefense(5)
                .setSpeed(15)
                .addAbility(factory.createAbility("Ice Shield").get(0))
                .setAI(BehaviorTypes.DEFENSIVE)
                .setLootTable(factory.createLootTable());
                return builder.build();
        }
        else if(type == EnemyType.SHADOW){
            builder.setName("Shadow Minion")
                .setHealth(200)
                .setDamage(10)
                .setDefense(5)
                .setSpeed(15)
                .addAbility(factory.createAbility("Shadow Strike").get(0))
                .setAI(BehaviorTypes.TACTICAL)
                .setLootTable(factory.createLootTable());
                return builder.build();
        }
        else{
            throw new IllegalArgumentException("Invalid enemy type: " + type);
        }
        
    }

    public Enemy createElite(ComponentsFactory factory, EnemyType type){
        if (type == EnemyType.FIRE) {
            builder.setName("Elite Fire")
                    .setHealth(500)
                    .setDamage(25)
                    .setDefense(10)
                    .setSpeed(30)
                    .addAbility(factory.createAbility("Fire Shield").get(0))
                    .addAbility(factory.createAbility("Fire Blast").get(0))
                    .setAI(BehaviorTypes.AGGRESSIVE)
                    .setLootTable(factory.createLootTable());
                    return builder.build();
        }
        else if(type == EnemyType.ICE){
            builder.setName("Elite Ice")
                    .setHealth(500)
                    .setDamage(25)
                    .setDefense(10)
                    .setSpeed(30)
                    .addAbility(factory.createAbility("Ice Shield").get(0))
                    .addAbility(factory.createAbility("Ice Storm").get(0))
                    .setAI(BehaviorTypes.DEFENSIVE)
                    .setLootTable(factory.createLootTable());
                    return builder.build();
        }
        else if(type == EnemyType.SHADOW){
            builder.setName("Elite Shadow")
                    .setHealth(500)
                    .setDamage(25)
                    .setDefense(10)
                    .setSpeed(30)
                    .addAbility(factory.createAbility("Shadow Strike").get(0))
                    .addAbility(factory.createAbility("Shadow Step").get(0))
                    .setAI(BehaviorTypes.TACTICAL)
                    .setLootTable(factory.createLootTable());
                    return builder.build();
        }
        else{
            throw new IllegalArgumentException("Invalid enemy type: " + type);
        }
    }

    public Enemy createMiniBoss(ComponentsFactory factory, EnemyType type){
        if(type == EnemyType.FIRE){
            builder.setName("MiniBoss")
                .setHealth(1000)
                .setDamage(50)
                .setDefense(20)
                .setSpeed(20)
                .addAbility(factory.createAbility("Fire Shield").get(0))
                .addAbility(factory.createAbility("Meteor Storm").get(0))
                .addPhase(1, 500)
                .addPhase(2,  200)
                .setAI(BehaviorTypes.DEFENSIVE)
                .setLootTable(factory.createLootTable());
                return builder.build();
        }
        else if(type == EnemyType.ICE){
            builder.setName("MiniBoss")
                    .setHealth(1000)
                    .setDamage(50)
                    .setDefense(20)
                    .setSpeed(20)
                    .addAbility(factory.createAbility("Ice Shield").get(0))
                    .addAbility(factory.createAbility("Blizzard").get(0))
                    .addPhase(1, 500)
                    .addPhase(2,  200)
                    .setAI(BehaviorTypes.DEFENSIVE)
                    .setLootTable(factory.createLootTable());
                    return builder.build();
        }
        else if(type == EnemyType.SHADOW){
            builder.setName("MiniBoss")
                    .setHealth(1000)
                    .setDamage(50)
                    .setDefense(20)
                    .setSpeed(20)
                    .addAbility(factory.createAbility("Shadow Strike").get(0))
                    .addAbility(factory.createAbility("Dark Nova").get(0))
                    .addPhase(1, 500)
                    .addPhase(2,  200)
                    .setAI(BehaviorTypes.DEFENSIVE)
                    .setLootTable(factory.createLootTable());
                    return builder.build();
        }
        else{
            throw new IllegalArgumentException("Invalid enemy type: " + type);
        }
    }
    
    public Enemy createRaidBoss(ComponentsFactory factory, EnemyType type){
        if(type == EnemyType.FIRE) {
                builder.setName("Raid Boss")
                .setHealth(5000)
                .setDamage(100)
                .setDefense(50)
                .setSpeed(10)
                .addAbility(factory.createAbility("Fire Shield").get(0))
                .addAbility(factory.createAbility("Meteor Storm").get(1))
                .addAbility(factory.createAbility("Fire Breath").get(2))
                .addPhase(1, 3000)
                .addPhase(2, 1000)
                .addPhase(3, 500)
                .setAI(BehaviorTypes.AGGRESSIVE)
                .setLootTable(factory.createLootTable());
        return builder.build();}
        else if(type == EnemyType.ICE){
            builder.setName("Raid Boss")
                    .setHealth(5000)
                    .setDamage(100)
                    .setDefense(50)
                    .setSpeed(10)
                    .addAbility(factory.createAbility("Ice Shield").get(0))
                    .addAbility(factory.createAbility("Blizzard").get(1))
                    .addAbility(factory.createAbility("Frost Breath").get(2))
                    .addPhase(1, 3000)
                    .addPhase(2, 1000)
                    .addPhase(3, 500)
                    .setAI(BehaviorTypes.DEFENSIVE)
                    .setLootTable(factory.createLootTable());
            return builder.build();
        }
        else if(type == EnemyType.SHADOW){
            builder.setName("Raid Boss")
                    .setHealth(5000)
                    .setDamage(100)
                    .setDefense(50)
                    .setSpeed(10)
                    .addAbility(factory.createAbility("Shadow Strike").get(0))
                    .addAbility(factory.createAbility("Dark Nova").get(1))
                    .addAbility(factory.createAbility("Vanish").get(2))
                    .addPhase(1, 3000)
                    .addPhase(2, 1000)
                    .addPhase(3, 500)
                    .setAI(BehaviorTypes.TACTICAL)
                    .setLootTable(factory.createLootTable());
            return builder.build();
        }
        else{
            throw new IllegalArgumentException("Invalid enemy type: " + type);
        }

    }






}
