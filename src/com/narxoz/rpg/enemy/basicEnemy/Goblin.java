package com.narxoz.rpg.enemy.basicEnemy;

import java.util.ArrayList;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;

public class Goblin extends Enemy {
    public Goblin() {}

    public Goblin(String name){
        this.name = name;
        this.health = 50;
        this.defense = 2;
        this.damage = 4;
        this.speed = 6;
        this.abilities = new ArrayList<>();
    }

    @Override
    public Enemy clone() {
        Goblin copy = new Goblin(this.name);
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
