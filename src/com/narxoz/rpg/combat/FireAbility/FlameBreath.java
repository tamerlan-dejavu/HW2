package com.narxoz.rpg.combat.FireAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class FlameBreath extends Ability {
    public FlameBreath(String name) {
        this.name = name;
        this.damage = 90;
        this.description = "Flame breath is a powerful fire-based attack, dealing significant damage over time.";
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
        return new FlameBreath(this.name); 
    }
}
