package com.teamProject.run.hyunji_island;

public class MammalFarm <T extends Mammal> {
    private T mammals;

    public MammalFarm() {}

    public MammalFarm(T mammals) {
        this.mammals = mammals;
    }

    public T getMammals() {
        return mammals;
    }

    public void setMammals(T mammals) {
        this.mammals = mammals;
    }

}
