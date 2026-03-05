package com.teamProject.run.sungjin;

public class WidecardFarm {
    public void anytype(SungjinFarm<?> farm) {
        farm.getAnimal().cry();
    }
    public void extendstype(SungjinFarm<? extends Giraffe> farm) {
        farm.getAnimal().cry();
    }
    public void supertype(SungjinFarm<? super Giraffe> farm) {
        farm.getAnimal().cry();
    }

}
