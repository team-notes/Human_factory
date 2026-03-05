package com.teamProject.jaewon;

public class CowBoy extends Centaur{

    @Override
    public void bark() {
        System.out.println("카우보이는 멍청하게 울지 않습니다 \"담배 한대 갖고온나\"");
    }

    @Override
    public void headAttack() {
        System.out.println("카우보이가 총을 꺼내듭니다!!\"혀어어어어어어업상\"");
    }

    public void arm() {
        System.out.println("카우보이가 담배에 불을 붙입니다\"남자의...향수 아이겠나..\"");
    }
}
