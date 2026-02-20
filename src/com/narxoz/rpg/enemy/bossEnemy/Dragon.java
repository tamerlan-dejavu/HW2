package com.narxoz.rpg.enemy.bossEnemy;

import com.narxoz.rpg.enemy.Enemy;
import java.util.HashMap;

public class Dragon extends Enemy {
    public Dragon(){} 

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    Dragon(Dragon other) {
        super(other);   
        this.phases = new HashMap<>(other.phases);
    }

    @Override
    public Enemy clone() {
        return new Dragon(this); 
    }

    
}
