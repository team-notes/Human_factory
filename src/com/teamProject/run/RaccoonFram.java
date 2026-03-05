package com.teamProject.run;

public class RaccoonFram<T extends Raccoon>{

    private T animal;

    public RaccoonFram() {}

    public RaccoonFram(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal){
        this.animal = animal;
    }

}
