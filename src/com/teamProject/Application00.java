package com.teamProject;

import com.teamProject.run.*;

public class Application00 {
    public static void main(String[] args) {

        // WildcardFoxFarm 을 사용할께! 정보를 줘!
        WildcardFoxFarm wildcardFoxFarm = new WildcardFoxFarm();

        // 아무 방식의 너구리의 출력
        wildcardFoxFarm.anyType(new RaccoonFram<Raccoon>(new Raccoon()));
        System.out.println("=== 구분선 ===");
        System.out.println("\n");
        wildcardFoxFarm.anyType(new RaccoonFram<LoansharkRaccoon>(new LoansharkRaccoon()));
        System.out.println("=== 구분선 ===");
        System.out.println("\n");
        wildcardFoxFarm.anyType(new RaccoonFram<PoorRaccoon>(new PoorRaccoon()));
        System.out.println("=== 구분선 ===");
        System.out.println("\n");

        System.out.println("=== 상속받는 너구리의 출력 ===");

        // 상속받는 너구리의 출력
//        wildcardFoxFarm.extendsType(new RaccoonFram<Raccoon>(new Raccoon()));
        System.out.println("extend 받는게 LoansharkRaccoon이라 Raccoon은 불가능");
        wildcardFoxFarm.extendsType(new RaccoonFram<LoansharkRaccoon>(new LoansharkRaccoon()));
        System.out.println("=== 구분선 ===");
        System.out.println("\n");
        wildcardFoxFarm.extendsType(new RaccoonFram<PoorRaccoon>(new PoorRaccoon()));
        System.out.println("=== 구분선 ===");
        System.out.println("\n");

        System.out.println("=== super 라쿤 ===");
        wildcardFoxFarm.superType(new RaccoonFram<Raccoon>(new Raccoon()));
        System.out.println("super의 제한을 Raccoon으로 뒀기 때문에 하위 너구리들은 출력 불가");
//        wildcardFoxFarm.superType(new RaccoonFram<LoansharkRaccoon>(new LoansharkRaccoon()));
//        wildcardFoxFarm.superType(new RaccoonFram<PoorRaccoon>(new PoorRaccoon()));



    }
}
