package com.narxoz.rpg.combat.ultimate;

import com.narxoz.rpg.combat.Ability;

public class Dark_nova implements Ability{
    private String name;
    private int damage;
    protected String description;

    public Dark_nova(String name){
        this.name = name;
        this.damage = 100; 
        this.description = "A powerful dark nova that deals massive damage to all enemies.";
    }

    @Override
    public String getName() {
        return "Dark Nova";
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
        return new Dark_nova(this.name);
    }
}