package com.narxoz.rpg.enemy.basicEnemy;

import com.narxoz.rpg.enemy.Enemy;

public class Orc extends Enemy {
    public Orc() {}

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Orc(Orc other) {
        super(other);   
    }

    @Override
    public Enemy clone() {
        return new Orc(this); 
    }
}
