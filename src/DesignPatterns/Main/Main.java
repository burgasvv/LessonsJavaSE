package DesignPatterns.Main;

import DesignPatterns.Adapter.Adapter;
import DesignPatterns.Adapter.MeteoStation;
import DesignPatterns.Adapter.TermometerF;
import DesignPatterns.Decorator.Axe;
import DesignPatterns.Decorator.Decorator;
import DesignPatterns.Decorator.Warrior;
import DesignPatterns.Prototype.Prototype;
import DesignPatterns.Singletone.Singletone;
import DesignPatterns.State.Liquid;
import DesignPatterns.State.Water;
import DesignPatterns.Strategy.Boat;
import DesignPatterns.Strategy.Car;
import DesignPatterns.Strategy.Explorer;
import DesignPatterns.Strategy.Plane;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Singletone singletone = Singletone.getSingleton();
        Singletone singletone1 = Singletone.getSingleton();
        System.out.println(singletone1);
        System.out.println(singletone);

        Prototype prototype = new Prototype(singletone);
        System.out.println(prototype);
        Prototype prototype1 = new Prototype(prototype);
        System.out.println(prototype1);
        Prototype prototype2 = prototype1.clone();
        System.out.println(prototype2);

        MeteoStation meteoStation = new MeteoStation(new Adapter(new TermometerF()));
        System.out.println(meteoStation);

        Water water = new Water(new Liquid());
        System.out.println(water);
        water.heat();
        System.out.println(water);
        water.freeze();
        water.freeze();
        System.out.println(water);

        Explorer explorer = new Explorer(new Plane());
        explorer.getMovable().move();
        explorer.setMovable(new Car());
        explorer.getMovable().move();
        explorer.setMovable(new Boat());
        explorer.getMovable().move();


    }
}