package designPatterns.creation.animals.model;

import designPatterns.creation.animals.model.contract.Movable;
import designPatterns.creation.animals.model.contract.CanSay;

public abstract class Animal implements Movable, CanSay {

    private int numberFoot;

    public void setNumberFoot(int numberFoot) {
        this.numberFoot = numberFoot;
    }

    public int getNumberFoot() {
        return numberFoot;
    }

    @Override
    public void move() {
        System.out.println("1. Stand up");
    }

    @Override
    public void say() {
        System.out.println("1. Open mouth");
    }
}
