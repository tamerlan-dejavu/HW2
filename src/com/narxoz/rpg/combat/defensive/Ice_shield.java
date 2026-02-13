package com.narxoz.rpg.combat.defensive;

import com.narxoz.rpg.combat.Ability;

public class Ice_shield implements Ability{
    private String name;
    private int damage;
    protected String description;

    public Ice_shield(String name){
        this.name = name;
        this.damage = -30; 
        this.description = "A powerful ice shield that reduces incoming damage.";
    }

    @Override
    public String getName() {
        return "Ice Shield";
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
    public Ability clone() {
        return new Ice_shield(this.name);
    }
}