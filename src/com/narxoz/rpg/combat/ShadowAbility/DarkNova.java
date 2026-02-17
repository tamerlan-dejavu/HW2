package com.narxoz.rpg.combat.ShadowAbility;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;
public class DarkNova extends Ability {
    public DarkNova(String name) {
        this.name = name;
        this.damage = 67;
        this.description = "A dark nova that deals massive shadow damage.";
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
        return new DarkNova(this.name); 
    }
}
