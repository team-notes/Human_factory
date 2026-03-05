package com.teamProject.jaewon;

public class Centaur extends Cow{

    @Override
    public void bark() {
        System.out.println("켄타우로스는 짐승이 아니라 울지 않고 말을합니다 \"안녕하세요\"");
    }

    @Override
    public void headAttack() {
        System.out.println("켄타우로스가 달려가 주먹을 날립니다!!!");
    }

    public void arm() {
        System.out.println("켄타우로스가 오버헤드프레스를 조집니다. \"영차!!!!!\"");
    }
}
