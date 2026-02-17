package com.narxoz.rpg.combat.ShadowAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class Vanish extends  Ability {
    public Vanish(String name) {
        this.name = name;
        this.damage = 0;
        this.description = "A stealth ability that makes the user invisible.";
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
        return AbilityType.PASSIVE; 
    }
    @Override 
    public Ability clone() { 
        return new Vanish(this.name); 
    }
}
