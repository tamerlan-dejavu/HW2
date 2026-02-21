package com.narxoz.rpg.enemy.bossEnemy;

import java.util.ArrayList;
import java.util.HashMap;

import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;

public class DemonLord extends Enemy {
    public DemonLord(){} 

    public DemonLord(String name){
        this.name = name;
        this.health = 1200;
        this.defense = 500;
        this.damage = 50;
        this.speed = 150;
        this.aiBehavior = BehaviorTypes.TACTICAL;
        this.canFly = false;
        this.hasBreathAttack = false;
        this.abilities = new ArrayList<>();
        this.phases = new HashMap<>();
    }

    @Override
    public Enemy clone() {
        DemonLord copy = new DemonLord(this.name);
        copy.health = this.health;
        copy.damage = this.damage;
        copy.defense = this.defense;
        copy.speed = this.speed;
        copy.phases = new HashMap<>(this.phases);
        copy.aiBehavior = this.aiBehavior;
        copy.canFly = this.canFly;
        copy.hasBreathAttack = this.hasBreathAttack;
        copy.abilities = new ArrayList<>();
        copy.element = this.element;
        copy.wingspan = this.wingspan;
        for (Ability ability : this.abilities) {
            copy.abilities.add(ability.clone());
        }
        if (this.lootTable != null) {
            copy.lootTable = this.lootTable.clone();
        }
        return copy;
    }
}
