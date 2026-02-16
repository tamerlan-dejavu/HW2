package com.narxoz.rpg.combat.FireAbility;

import com.narxoz.rpg.combat.Ability;

public class FlameBreath extends FireAbility implements Ability {

    public FlameBreath(String name) {
        this.name = name;
        this.damage = 90;
        this.description = "Flame breath is a powerful fire-based attack, dealing significant damage over time.";
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
        return new FlameBreath(this.name);
    }
}
