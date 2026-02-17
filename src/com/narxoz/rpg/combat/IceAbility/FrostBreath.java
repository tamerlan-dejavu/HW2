package com.narxoz.rpg.combat.IceAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class FrostBreath extends Ability {
    public FrostBreath(String name) {
        this.name = name;
        this.damage = 10;
        this.description = "A freezing breath that slows enemies.";
        this.type = AbilityType.DAMAGE;
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
        return this.type; 
    }
    @Override 
    public Ability clone() { 
        return new FrostBreath(this.name); 
    }
}

