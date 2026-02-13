package com.narxoz.rpg.combat.buff_or_debuff;

import com.narxoz.rpg.combat.Ability;

public class Poison_cloud implements Ability{
    private String name;
    private int damage;
    protected String description;

    public Poison_cloud(String name){
        this.name = name;
        this.damage = 6; 
        this.description = "A cloud of poison that damages enemies over time.";
    }

    @Override
    public String getName() {
        return "Poison Cloud";
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
        return new Battle_cry(this.name);
    }
}