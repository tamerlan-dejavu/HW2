package com.narxoz.rpg.enemy.basicEnemy;

import java.util.ArrayList;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;

public class Orc extends Enemy {
    public Orc() {}

    public Orc(String name){
        this.name = name;
        this.health = 60;
        this.defense = 8;
        this.damage = 3;
        this.speed = 2;
        this.abilities = new ArrayList<>();
    }

    @Override
    public Enemy clone() {
        Orc copy = new Orc(this.name);
        copy.health = this.health;
        copy.damage = this.damage;
        copy.defense = this.defense;
        copy.speed = this.speed;
        copy.abilities = new ArrayList<>();
        for (Ability ability : this.abilities) {
            copy.abilities.add(ability.clone());
        }
        if (this.lootTable != null) {
            copy.lootTable = this.lootTable.clone();
        }
        
        return copy;
    }
}
