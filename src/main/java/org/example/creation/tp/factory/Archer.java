package org.example.creation.tp.factory;

public class Archer extends Character {
    public Archer() {
        this.name = "Archer";
        this.health = 120;
        this.attack = 25;
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("Archer shoots a powerful arrow!");
    }
}
