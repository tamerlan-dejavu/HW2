package com.narxoz.rpg.combat.damage;

import com.narxoz.rpg.combat.Ability;

public class Shadow_strike implements Ability{
    private String name;
    private int damage;
    protected String description;

    public Shadow_strike(String name){
        this.name = name;
        this.damage = 52; 
        this.description = "A powerful shadow strike that deals critical damage to enemies.";
    }

    @Override
    public String getName() {
        return "Shadow Strike";
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
        return new Shadow_strike(this.name);
    }
}