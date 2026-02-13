package com.narxoz.rpg.combat.buff_or_debuff;

import com.narxoz.rpg.combat.Ability;

public class Battle_cry implements Ability{
    private String name;
    private int damage;
    protected String description;

    public Battle_cry(String name){
        this.name = name;
        this.damage = 0; 
        this.description = "A powerful shout that boosts allies morale, increasing their attack power for the next turn.";
    }

    @Override
    public String getName() {
        return "Battle Cry";
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