package com.teamProject.jaewon;

public class AnimalFarm < A extends SimilerAnimal>{

    private A animal;

    public AnimalFarm() {}

    public AnimalFarm(A animal) {
        this.animal = animal;
    }

    public A getAnimal() {
        return animal;
    }

    public void setAnimal(A animal) {
        this.animal = animal;
    }

}
