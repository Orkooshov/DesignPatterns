package designPatterns.structure;

public class Adapter {
    static class Adaptee {
        public void doSomething() {
            System.out.println("something");
        }
    }
    interface Target {
        void doSomethingElse();
    }

    static class Wrapper implements Target {
        private Adaptee adaptee;
        public Wrapper(Adaptee a) {
            adaptee = a;
        }

        @Override
        public void doSomethingElse() {
            adaptee.doSomething();
        }
    }

    public static void test() {
        Adaptee a = new Adaptee();
        Target t = new Wrapper(a);
        t.doSomethingElse();
    }
}
