package org.orkooshov.designPatterns.creation.animals.model;

import designPatterns.creation.Prototype;
import designPatterns.creation.animals.builder.CatBuilder;

public class Cat extends Animal implements Prototype {
    @Override
    public void say() {
        super.say();
        System.out.println("2. Meow");
        System.out.println("3. Shut the mouth");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("2. move");
    }

    public Cat withNumberFoot(int feet) {
        return newBuilder().setNumberFoot(feet).build();
    }

    public static CatBuilder newBuilder() {
        return new CatBuilder();
    }

    @Override
    public Prototype clone() {
        return newBuilder().setNumberFoot(getNumberFoot()).build();
    }
}
