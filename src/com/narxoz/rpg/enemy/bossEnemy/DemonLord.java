package com.narxoz.rpg.enemy.bossEnemy;

import com.narxoz.rpg.enemy.Enemy;
import java.util.HashMap;

public class DemonLord extends Enemy {
    public DemonLord(){} 

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    DemonLord(DemonLord other) {
        super(other);   
        this.phases = new HashMap<>(other.phases);
    }

    @Override
    public Enemy clone() {
        return new DemonLord(this); 
    }
}
