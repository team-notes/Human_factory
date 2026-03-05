package com.teamProject.run;

import com.teamProject.run.sungjin.*;

public class Application04 {
    public static void main(String[] args) {

        WidecardFarm wfarm = new WidecardFarm();
        EatFarm efarm = new EatFarm();
        wfarm.anytype(new SungjinFarm<Elephant>(new Elephant()));
        wfarm.anytype(new SungjinFarm<Giraffe>(new Giraffe()));
        wfarm.anytype(new SungjinFarm<Puma>(new Puma()));

        System.out.println("====================================");
//        wfarm.extendstype(new SungjinFarm<Elephant>(new Elephant()));
        wfarm.extendstype(new SungjinFarm<Giraffe>(new Giraffe()));
        wfarm.extendstype(new SungjinFarm<Puma>(new Puma()));

        System.out.println("=================================");
        wfarm.supertype(new SungjinFarm<Elephant>(new Elephant()));
        wfarm.supertype(new SungjinFarm<Giraffe>(new Giraffe()));
//        wfarm.supertype(new SungjinFarm<Puma>(new Puma()));

        System.out.println("====================================");
        efarm.anytype(new SungjinFarm<Elephant>(new Elephant()));
        efarm.anytype(new SungjinFarm<Giraffe>(new Giraffe()));
        efarm.anytype(new SungjinFarm<Puma>(new Puma()));

        System.out.println("====================================");
//        efarm.extendstype(new SungjinFarm<Elephant>(new Elephant()));
        efarm.extendstype(new SungjinFarm<Giraffe>(new Giraffe()));
        efarm.extendstype(new SungjinFarm<Puma>(new Puma()));

        System.out.println("====================================");
        efarm.supertype(new SungjinFarm<Elephant>(new Elephant()));
        efarm.supertype(new SungjinFarm<Giraffe>(new Giraffe()));
//        efarm.supertype(new SungjinFarm<Puma>(new Puma()));

    }
}
