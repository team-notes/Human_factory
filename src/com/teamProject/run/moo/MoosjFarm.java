package com.teamProject.run.moo;

public class MoosjFarm <T extends Moosj>{

    private T Msk;
    public MoosjFarm(T Msk){
        this.Msk = Msk;
    }

    public T getMsk() {
        return Msk;
    }


}
