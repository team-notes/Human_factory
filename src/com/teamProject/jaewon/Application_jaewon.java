package com.teamProject.jaewon;

public class Application_jaewon {

    public static void main(String[] args) {


        WildCardFarm wild = new WildCardFarm();

        System.out.println("모든 동물이 울부짖습니다!");

        System.out.println("===========================================================");

        wild.anyType(new AnimalFarm<Cow>(new Cow()));
        wild.anyType(new AnimalFarm<Centaur>(new Centaur()));
        wild.anyType(new AnimalFarm<CowBoy>(new CowBoy()));
        wild.anyType(new AnimalFarm<Fox>(new Fox()));
        wild.anyType(new AnimalFarm<NineTail>(new NineTail()));
        wild.anyType(new AnimalFarm<Ahri>(new Ahri()));

        System.out.println("========================= 소 울음 =====================");

        System.out.println("소들이 울부짖습니다!");

        System.out.println("===========================================================");

        wild.cowbark(new CowFarm<Cow>(new Cow()));
        wild.cowbark(new CowFarm<Centaur>(new Centaur()));
        wild.cowbark(new CowFarm<CowBoy>(new CowBoy()));

        System.out.println("====================== 소 공격=====================");

        System.out.println("소가 들이박습니다!");

        System.out.println("===========================================================");

        wild.cowattack(new CowFarm<Cow>(new Cow()));
        wild.cowattack(new CowFarm<Centaur>(new Centaur()));
        wild.cowattack(new CowFarm<CowBoy>(new CowBoy()));

        System.out.println("======================= 소 자손 =====================");

        System.out.println("소의 자식들이 손이 없는 부모를 놀립니다!");

        System.out.println("===========================================================");

        //wild.armaction(new CowFarm<Cow>(new Cow()));
        wild.armaction(new CowFarm<Centaur>(new Centaur()));
        wild.armaction(new CowFarm<CowBoy>(new CowBoy()));

        System.out.println("============================= 여우 울음 ======================");

        System.out.println("여우가 웁니다!");

        System.out.println("===========================================================");

        wild.foxbark(new FoxFarm<Fox>(new Fox()));
        wild.foxbark(new FoxFarm<NineTail>(new NineTail()));
        wild.foxbark(new FoxFarm<Ahri>(new Ahri()));

        System.out.println("========================== 여우 끼 ========================");

        System.out.println("여우가 끼부립니다!");

        System.out.println("===========================================================");

        wild.foxappeal(new FoxFarm<Fox>(new Fox()));
        wild.foxappeal(new FoxFarm<NineTail>(new NineTail()));
        wild.foxappeal(new FoxFarm<Ahri>(new Ahri()));

        System.out.println("=========================== 여우 자손 =========================");

        System.out.println("여우의 자손들이 스킬을 사용합니다!");

        System.out.println("===========================================================");

        //wild.foxskill(new FoxFarm<Fox>(new Fox()));
        wild.foxskill(new FoxFarm<NineTail>(new NineTail()));
        wild.foxskill(new FoxFarm<Ahri>(new Ahri()));


    }
}
