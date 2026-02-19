package com.narxoz.rpg.enemy.basicEnemy;

import com.narxoz.rpg.enemy.Enemy;

public class Skeleton extends Enemy {
    public Skeleton() {}

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Skeleton(Skeleton other) {
        super(other);   
    }

    @Override
    public Enemy clone() {
        return new Skeleton(this); 
    }
}
