package designPatterns.creation.animals.builder;

import designPatterns.creation.animals.model.Cat;

public class CatBuilder {
    private int numberFoot;
    public CatBuilder setNumberFoot(int value) {
        numberFoot = value;
        return this;
    }

    public Cat build() {
        Cat cat = new Cat();
        cat.setNumberFoot(numberFoot);
        return cat;
    }
}
