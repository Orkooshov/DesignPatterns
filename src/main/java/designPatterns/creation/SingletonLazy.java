package designPatterns.creation;

public class SingletonLazy {
    private SingletonLazy() {}

    String state = "Hello";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private static SingletonLazy instance;
    public static SingletonLazy getInstance() {
        if (instance == null) instance = new SingletonLazy();
        return instance;
    }
}
