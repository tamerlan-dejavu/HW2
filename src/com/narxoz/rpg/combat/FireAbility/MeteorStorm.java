package com.narxoz.rpg.combat.FireAbility;

import com.narxoz.rpg.combat.Ability;

public class MeteorStorm extends FireAbility implements Ability {
    public MeteorStorm(String name) {
        this.name = name;
        this.damage = 150;
        this.description = "Summons a storm of meteors to strike all enemies.";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Ability clone() {
        return new MeteorStorm(this.name);
    }
}
