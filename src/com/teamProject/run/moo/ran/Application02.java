package com.teamProject.run.moo.ran;

import com.teamProject.run.moo.*;

public class Application02 {
    public static void main(String[] args) {

        MooTown moot = new MooTown();

        moot.anyType(new MoosjFarm<Moosj>(new Moosj()));
        moot.anyType(new MoosjFarm<BigMoosj>(new BigMoosj()));
        moot.anyType(new MoosjFarm<DrunkenBigMoosj>(new DrunkenBigMoosj()));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


        //moot.extendType(new MoosjFarm<Moosj>(new Moosj()));
        moot.extendType(new MoosjFarm<BigMoosj>(new BigMoosj()));
        moot.extendType(new MoosjFarm<DrunkenBigMoosj>(new DrunkenBigMoosj()));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


        moot.superType(new MoosjFarm<Moosj>(new Moosj()));
        moot.superType(new MoosjFarm<BigMoosj>(new BigMoosj()));
       // moot.superType(new MoosjFarm<DrunkenBigMoosj>(new DrunkenBigMoosj()));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
