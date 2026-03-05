package com.teamProject;

import com.teamProject.run.hyunji_island.*;

public class Application03 {
    public static void main(String[] args) {

        ChickenFarm<Chicken> farm2 = new ChickenFarm<>();
        ChickenFarm<BBQ> farm3 = new ChickenFarm<>();

        farm2.setBirds(new Chicken());
        farm2.getBirds().kkokio();
        farm2.getBirds().beak();

        farm3.setBirds(new BBQ());
        farm3.getBirds().kkokio();
        farm3.getBirds().beak();

        MammalFarm<Mammal> farm5 = new MammalFarm<>();
        MammalFarm<Dog> farm6 = new MammalFarm<>();
        MammalFarm<Cat> farm7 = new MammalFarm<>();

        farm5.setMammals(new Mammal());
        farm5.getMammals().bark();
        farm5.getMammals().eat();

        farm6.setMammals(new Dog());
        farm6.getMammals().bark();
        farm6.getMammals().eat();

        farm7.setMammals(new Cat());
        farm7.getMammals().bark();
        farm7.getMammals().eat();



    }
}