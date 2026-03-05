package com.teamProject.run.moo;

public class MooTown {
    public void anyType(MoosjFarm<?> farm){
        farm.getMsk().eat();
    }

    public void extendType(MoosjFarm<? extends BigMoosj> farm){
        farm.getMsk().eat();
    }

    public void superType(MoosjFarm<? super  BigMoosj> farm){
        farm.getMsk().eat();
    }


}
