package Patterns.Singleton;

public class Singletone { // Pattern "singletone" объект в единственном экземпляре
    private static Singletone singletone;
    public static Singletone getObject(){
        if (singletone == null)
            singletone = new Singletone();
        return singletone;
    }
}