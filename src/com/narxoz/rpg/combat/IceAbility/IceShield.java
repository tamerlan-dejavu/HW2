package com.narxoz.rpg.combat.IceAbility;

import com.narxoz.rpg.combat.Ability;

public class IceShield extends IceAbility implements Ability {
    public IceShield(String name) {
        this.name = name;
        this.damage = 0;
        this.description = "A defensive ice shield that reduces incoming damage.";
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
        return new IceShield(this.name);
    }
}
