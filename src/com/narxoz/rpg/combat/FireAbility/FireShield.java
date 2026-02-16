package com.narxoz.rpg.combat.FireAbility;

import com.narxoz.rpg.combat.Ability;

public class FireShield extends FireAbility implements Ability {
    public FireShield(String name) {
        this.name = name;
        this.damage = 0;
        this.description = "A defensive fire shield that reduces incoming damage.";
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
        return new FireShield(this.name);
    }
}
