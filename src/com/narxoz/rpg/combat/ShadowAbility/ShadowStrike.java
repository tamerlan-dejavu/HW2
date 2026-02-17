package com.narxoz.rpg.combat.ShadowAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class ShadowStrike extends Ability {
    public ShadowStrike(String name) {
        this.name = name;
        this.damage = 88;
        this.description = "A swift shadow strike that deals moderate shadow damage.";
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
        return AbilityType.DAMAGE; 
    }
    @Override 
    public Ability clone() { 
        return new ShadowStrike(this.name); 
    }
}
