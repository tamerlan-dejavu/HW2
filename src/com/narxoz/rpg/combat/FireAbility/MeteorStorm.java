package com.narxoz.rpg.combat.FireAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class MeteorStorm extends Ability {
    public MeteorStorm(String name) {
        this.name = name;
        this.damage = 150;
        this.description = "Summons a storm of meteors to strike all enemies.";
    }
    @Override 
    public String getName() { 
        return name; 
    }
    @Override 
    public int getDamage() { 
        return damage; 
    }
    @Override 
    public String getDescription() {
        return description; 
    }
    @Override 
    public AbilityType getType() { 
        return AbilityType.ULTIMATE; 
    }
    @Override 
    public Ability clone() { 
        return new MeteorStorm(this.name); 
    }
}
