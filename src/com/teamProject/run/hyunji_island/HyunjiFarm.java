package com.teamProject.run.hyunji_island;

public class HyunjiFarm {
    public void anyType(ChickenFarm<?> farm) {
        farm.getBirds().beak();
        farm.getBirds().kkokio();
    }

    public void extendsType(ChickenFarm<BBQ> bbqChickenFarm) {
    }

    public void superType(ChickenFarm<Chicken> chickenChickenFarm) {
    }

    public void anyType(MammalFarm<?> farm) {
        farm.getMammals().bark();
        farm.getMammals().eat();
        farm.getMammals().cry();
    }
}
