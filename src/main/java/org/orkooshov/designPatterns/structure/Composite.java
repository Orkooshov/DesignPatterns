package org.orkooshov.designPatterns.structure;

import java.util.Arrays;
import java.util.List;

public class Composite {
    public interface Movable {
        void move();
    }

    public static class Leaf implements Movable {
        @Override
        public void move() {
            System.out.println("move");
        }
    }

    public static class Group implements Movable {
        final private List<Movable> movables = Arrays.asList(new Leaf(), new Leaf());

        @Override
        public void move() {
            movables.forEach(Movable::move);
        }
    }

    public static void test() {
        new Group().move();
    }
}
