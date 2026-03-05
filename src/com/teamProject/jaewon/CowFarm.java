package com.teamProject.jaewon;

public class CowFarm <C extends Cow>{

    private C smileranimal;

    public CowFarm() {
    }

    public CowFarm(C smileranimal) {
        this.smileranimal = smileranimal;
    }

    public C getSmileranimal() {
        return smileranimal;
    }

    public void setSmileranimal(C smileranimal) {
        this.smileranimal = smileranimal;
    }
}
