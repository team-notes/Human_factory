package com.teamProject.run.hyunji_island;

public class ChickenFarm<T extends Birds> {

    private T birds;

    public ChickenFarm() {}

    public ChickenFarm(T birds) {
        this.birds = birds;
    }

    public T getBirds() {
        return birds;
    }

    public void setAnimal(T animal) {
        this.birds = animal;
    }

    public void setBirds(T chicken) {
        this.birds = chicken;
    }
}
