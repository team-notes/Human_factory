package com.teamProject.run.sungjin;

public class SungjinFarm<T extends Elephant> {
    private T animal;

    public SungjinFarm() {}

    public SungjinFarm(T animal) {
        this.animal = animal;
    }
    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
