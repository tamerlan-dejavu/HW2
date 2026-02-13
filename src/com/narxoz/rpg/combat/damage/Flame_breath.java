package com.narxoz.rpg.combat.damage;

import com.narxoz.rpg.combat.Ability;

public class Flame_breath implements Ability{
    private String name;
    private int damage;
    protected String description;

    public Flame_breath(String name){
        this.name = name;
        this.damage = 67; 
        this.description = "A powerful breath of flame that burns enemies.";
    }

    @Override
    public String getName() {
        return "Flame Breath";
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
        return new Flame_breath(this.name);
    }
}