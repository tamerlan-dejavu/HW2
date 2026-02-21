package com.narxoz.rpg.enemy.basicEnemy;

import java.util.ArrayList;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;

public class Skeleton extends Enemy {
    public Skeleton() {}

    public Skeleton(String name){
        this.name = name;
        this.health = 30;
        this.defense = 4;
        this.damage = 10;
        this.speed = 8;
        this.abilities = new ArrayList<>();

    }

    @Override
    public Enemy clone() {
        Skeleton copy = new Skeleton(this.name);
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
