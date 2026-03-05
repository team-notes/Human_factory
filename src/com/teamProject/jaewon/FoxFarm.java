package com.teamProject.jaewon;

public class FoxFarm <F extends Fox>{

    private F shangus;

    public FoxFarm() {}

    public FoxFarm(F shangus) {
        this.shangus = shangus;
    }

    public F getShangus() {
        return shangus;
    }

    public void setShangus(F sangus) {
        this.shangus = shangus;
    }
}
