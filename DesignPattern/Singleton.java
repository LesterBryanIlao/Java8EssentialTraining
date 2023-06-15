package DesignPattern;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton (){}

    public static Singleton getInstance(){
        return instance;
    }

    String getString(){
        return "This is singleton.";
    }
}
