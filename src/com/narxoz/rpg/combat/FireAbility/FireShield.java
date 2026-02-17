package com.narxoz.rpg.combat.FireAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class FireShield extends Ability {
    public FireShield(String name) {
        this.name = name;
        this.damage = 20;
        this.description = "A defensive fire shield that reduces incoming damage.";
        this.type = AbilityType.DEFENSIVE;
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
        return new FireShield(this.name); 
    }
}
