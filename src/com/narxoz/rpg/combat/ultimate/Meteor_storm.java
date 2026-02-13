package com.narxoz.rpg.combat.ultimate;

import com.narxoz.rpg.combat.Ability;

public class Meteor_storm implements Ability{
    private String name;
    private int damage;
    protected String description;

    public Meteor_storm(String name){
        this.name = name;
        this.damage = 150; 
        this.description = "A powerful meteor storm that deals massive damage to all enemies.";
    }

    @Override
    public String getName() {
        return "Meteor Storm";
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
        return new Meteor_storm(this.name);
    }
}