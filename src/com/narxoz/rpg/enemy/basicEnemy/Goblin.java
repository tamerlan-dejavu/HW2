package com.narxoz.rpg.enemy.basicEnemy;

import com.narxoz.rpg.enemy.Enemy;

public class Goblin extends Enemy {
    public Goblin() {}

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Goblin(Goblin other) {
        super(other);   
    }

    @Override
    public Enemy clone() {
        return new Goblin(this); 
    }
}
