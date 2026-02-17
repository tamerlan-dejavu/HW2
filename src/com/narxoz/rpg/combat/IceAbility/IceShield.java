package com.narxoz.rpg.combat.IceAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class IceShield extends Ability {
    public IceShield(String name) {
        this.name = name;
        this.damage = 0;
        this.description = "A defensive ice shield that reduces incoming damage.";
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
        return AbilityType.DEFENSIVE; 
    }
    @Override 
    public Ability clone() { 
        return new IceShield(this.name); 
    }
}
