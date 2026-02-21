package com.narxoz.rpg.enemy.bossEnemy;

import java.util.ArrayList;
import java.util.HashMap;

import com.narxoz.rpg.behavior.BehaviorTypes;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.enemy.Enemy;

public class Dragon extends Enemy {
    public Dragon(){} 

    public Dragon(String name){
        this.name = name;
        this.health = 900;
        this.defense = 100;
        this.damage = 225;
        this.speed = 230;
        this.aiBehavior = BehaviorTypes.AGGRESSIVE;
        this.canFly = true;
        this.hasBreathAttack = true;
        this.abilities = new ArrayList<>();
        this.phases = new HashMap<>();
    }

    @Override
    public Enemy clone() {
        Dragon copy = new Dragon(this.name);
        copy.health = this.health;
        copy.damage = this.damage;
        copy.defense = this.defense;
        copy.speed = this.speed;
        copy.phases = new HashMap<>(this.phases);
        copy.aiBehavior = this.aiBehavior;
        copy.canFly = this.canFly;
        copy.element = this.element;
        copy.wingspan = this.wingspan;
        copy.hasBreathAttack = this.hasBreathAttack;
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
