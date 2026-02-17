package com.narxoz.rpg.combat.IceAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class Blizzard extends Ability {
    public Blizzard(String name) {
        this.name = name;
        this.damage = 15;
        this.description = "A freezing attack that slows enemies.";
        this.type = AbilityType.ULTIMATE;
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
        return new Blizzard(this.name); 
    }
}
