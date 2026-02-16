package com.narxoz.rpg.combat.ShadowAbility;

import com.narxoz.rpg.combat.Ability;

public class Vanish extends ShadowAbility implements Ability {
    public Vanish(String name) {
        this.name = name;
        this.damage = 0;
        this.description = "A stealth ability that makes the user invisible.";
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
        return new Vanish(this.name);
    }
}
