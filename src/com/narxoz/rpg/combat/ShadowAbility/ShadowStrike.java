package com.narxoz.rpg.combat.ShadowAbility;

import com.narxoz.rpg.combat.Ability;

public class ShadowStrike extends ShadowAbility implements Ability {
    public ShadowStrike(String name) {
        this.name = name;
        this.damage = 67;
        this.description = "A swift shadow strike that deals moderate shadow damage.";
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
        return new ShadowStrike(this.name);
    }
}
