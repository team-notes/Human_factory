package com.teamProject.jaewon;

public class WildCardFarm {

    public void anyType(AnimalFarm<?> farm) {
        farm.getAnimal().bark();
    }

    public void cowbark(CowFarm<?> farm) {
        farm.getSmileranimal().bark();
    }

    public void cowattack(CowFarm<?> farm) {
        farm.getSmileranimal().headAttack();
    }

    public void armaction(CowFarm<? extends Centaur> farm) {
        farm.getSmileranimal().arm();
    }

    public void foxbark(FoxFarm<?> farm) {
        farm.getShangus().bark();
    }

    public void foxappeal(FoxFarm<?> farm) {
        farm.getShangus().appeal();
    }

    public void foxskill(FoxFarm<? extends NineTail> farm) {
        farm.getShangus().skill();
    }

}
