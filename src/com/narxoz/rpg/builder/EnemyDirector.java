package com.narxoz.rpg.builder;

import com.narxoz.rpg.abstractFactory.ComponentsFactory;
import com.narxoz.rpg.enemy.Enemy;


public class EnemyDirector {
    public Enemy createMinion(ComponentsFactory componentFactory) {
        return new BasicBuilder()
            .setName("Minion")
            .setHealth(50)
            .setDamage(10)
            .setDefense(2)
            .setSpeed(25)
            .setAbilities(componentFactory.createAbilities())
            .setLootTable(componentFactory.createLootTable())
            .build();
    }

    public Enemy createElite(ComponentsFactory componentFactory) {
        return new BasicBuilder()
            .setName("Elite Enemy")
            .setHealth(200)
            .setDamage(35)
            .setDefense(10)
            .setSpeed(30)
            .setAbilities(componentFactory.createAbilities())
            .setLootTable(componentFactory.createLootTable())
            .build();
    }

    public Enemy createMiniBoss(ComponentsFactory componentFactory) {
        return ((BossBuilder) new BossBuilder()
            .setName("Mini Boss")
            .setHealth(1000)
            .setDamage(100)
            .setDefense(30)
            .setSpeed(40))
            .addPhase(1, 1000)
            .addPhase(2, 500)
            .setAbilities(componentFactory.createAbilities())
            .setLootTable(componentFactory.createLootTable())
            .build();
    }

    public Enemy createRaidBoss(ComponentsFactory componentFactory) {
        return new BossBuilder()
            .setName("Raid Boss")
            .setHealth(52000)
            .setDamage(500)
            .setDefense(200)
            .setSpeed(50)
            .addPhase(1, 52000)
            .addPhase(2, 30000)
            .addPhase(3, 10000)
            .setCanFly(true)
            .setHasBreathAttack(true)
            .setWingspan(20)
            .setAbilities(componentFactory.createAbilities())
            .setLootTable(componentFactory.createLootTable())
            .build();
    }
}
