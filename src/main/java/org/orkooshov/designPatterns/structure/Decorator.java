package org.orkooshov.designPatterns.structure;

public class Decorator {
    static class Cat {
        private int feet;
        public Cat(int feet) {
            this.feet = feet;
        }
        public int getFeet() { return feet; }
    }

    static class CatDecorator extends Cat {
        public CatDecorator(int feet) {
            super(feet);
        }

        @Override
        public int getFeet() {
            return super.getFeet() + 1;
        }
    }

    public static void test() {
        System.out.println(new CatDecorator(4).getFeet());
    }
}
