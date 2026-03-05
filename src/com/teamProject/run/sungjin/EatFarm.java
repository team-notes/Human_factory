package com.teamProject.run.sungjin;

public class EatFarm {
    public void anytype(SungjinFarm<?> farm) {
        farm.getAnimal().eat();
    }
    public void extendstype(SungjinFarm<? extends Giraffe> farm) {
        farm.getAnimal().eat();
    }
    public void supertype(SungjinFarm<? super Giraffe> farm) {
        farm.getAnimal().eat();
    }
}
