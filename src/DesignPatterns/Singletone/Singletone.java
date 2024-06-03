package DesignPatterns.Singletone;

public class Singletone {
    private static Singletone singletone;
    public static Singletone getSingleton() {
        if (singletone == null)
            singletone = new Singletone();
        return singletone;
    }
}