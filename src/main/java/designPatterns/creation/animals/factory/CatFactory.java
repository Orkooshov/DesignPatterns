package designPatterns.creation.animals.factory;

import designPatterns.creation.animals.model.Cat;

public class CatFactory {
    public static Cat getCat() {
        return Cat.newBuilder().setNumberFoot(4).build();
    }
    public static Cat getCat(int numberFoot) {
        return Cat.newBuilder().setNumberFoot(numberFoot).build();
    }
}
