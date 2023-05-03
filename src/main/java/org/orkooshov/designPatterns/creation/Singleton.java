package org.orkooshov.designPatterns.creation;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    private String state = "hello";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
