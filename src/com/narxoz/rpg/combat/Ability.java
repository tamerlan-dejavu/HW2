package com.narxoz.rpg.combat;

/**
 * Interface for all enemy abilities in the RPG system.
 *
 * Every enemy can have one or more abilities. Abilities vary widely:
 * - Damage abilities (Flame Breath, Shadow Strike)
 * - Buff/debuff abilities (Battle Cry, Poison Cloud)
 * - Defensive abilities (Ice Shield, Vanish)
 * - Ultimate abilities (Meteor Storm, Dark Nova)
 *
 * Prototype Pattern Note:
 * Abilities must be DEEP-COPYABLE! When you clone an enemy,
 * its abilities must also be cloned. Otherwise, two enemies
 * will share the same ability objects — and modifying one
 * will affect the other. This is a critical requirement.
 * Consider methods like:
 * - String getName()
 * - int getDamage()
 * - String getDescription()
 * - AbilityType getType() (e.g., DAMAGE, BUFF, DEBUFF, ULTIMATE)
 * - Ability clone()   <-- Critical for Prototype pattern!
 */
public interface Ability {
    // - String getName()
    String getName();
    // - int getDamage()
    int getDamage();
    // - String getDescription()
    String getDescription();
    // - Ability clone()  <-- IMPORTANT for deep copying!
    Ability clone();
}
