package designPatterns.creation.animals.factory;

import designPatterns.creation.animals.model.Animals;
import designPatterns.creation.animals.model.Animal;

public class AnimalFactory {
    public static Animal getAnimal(Animals animal) {
        if (animal == Animals.CAT) {
            return CatFactory.getCat();
        }
        return null;
    }
}
