package com.teamProject.run;

public class WildcardFoxFarm {

    public void anyType(RaccoonFram<?> farm) {
        farm.getAnimal().mummble();
    }

    public void extendsType(RaccoonFram<? extends LoansharkRaccoon> farm) {
        farm.getAnimal().mummble();
    }

    public void superType(RaccoonFram<? super Raccoon> farm) {
        farm.getAnimal().mummble();
    }

}
