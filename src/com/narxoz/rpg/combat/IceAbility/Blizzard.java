package com.narxoz.rpg.combat.IceAbility;

import com.narxoz.rpg.combat.Ability;

public class Blizzard extends IceAbility implements Ability {
    public Blizzard(String name) {
        this.name = name;
        this.damage = 15;
        this.description = "A freezing breath that slows enemies.";
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
        return new Blizzard(this.name);
    }
}
