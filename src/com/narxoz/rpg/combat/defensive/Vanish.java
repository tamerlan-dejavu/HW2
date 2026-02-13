package com.narxoz.rpg.combat.defensive;

import com.narxoz.rpg.combat.Ability;

public class Vanish implements Ability{
    private String name;
    private int damage;
    protected String description;

    public Vanish(String name){
        this.name = name;
        this.damage = 0; 
        this.description = "A powerful vanish ability that makes the user temporarily invisible.";
    }

    @Override
    public String getName() {
        return "Vanish";
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
        return new Vanish(this.name);
    }
}