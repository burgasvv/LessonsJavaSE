package Patterns.Main;

import Patterns.Adapter.Meteostation;
import Patterns.Adapter.ThermometerAdapter;
import Patterns.Adapter.ThermometerC;
import Patterns.Adapter.ThermometerF;
import Patterns.Observer.NewsPaper.BadCritic;
import Patterns.Observer.NewsPaper.GoodCritic;
import Patterns.Observer.NewsPaper.NewsPaper;
import Patterns.Prototype.Prototype;
import Patterns.Singleton.Singletone;
import Patterns.State.Water;
import Patterns.Strategy.Methodics.*;
import Patterns.Strategy.Movable.Boat;
import Patterns.Strategy.Movable.Bus;
import Patterns.Strategy.Movable.Explorer;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String ...args) {

        Singletone singletone = Singletone.getObject();
        Singletone singletone1 = Singletone.getObject();
        System.out.println(singletone);
        System.out.println(singletone1);

        Prototype slava = new Prototype("Slava","Novosibirsk",30,"89045678934");
        Prototype olga = new Prototype(slava);
        olga.setName("Olga");
        System.out.println(slava);
        System.out.println(olga);

        Meteostation meteostation = new Meteostation(new ThermometerC());
        System.out.println(meteostation.getThermometer());
        Meteostation meteostation1 = new Meteostation(new ThermometerAdapter(new ThermometerF()));
        System.out.println(meteostation1.getThermometer());

        Explorer explorer = new Explorer();
        System.out.println(explorer.move());
        explorer.changeTransport(new Boat());
        System.out.println(explorer.move());
        explorer.changeTransport(new Bus());
        System.out.println(explorer.move());

        Calculator calculator = new Calculator(new Sum());
        System.out.println(calculator.calculate(15,25,30,50,20));
        calculator.changeMethodics(new Difference());
        System.out.println(calculator.calculate(55,25,10));
        calculator.changeMethodics(new Multiply());
        System.out.println(calculator.calculate(2,4,6));
        calculator.changeMethodics(new Division());
        System.out.println(calculator.calculate(25,5));

        IntStream intStream = new Random().ints(10,10,100).sorted();
        System.out.println(Arrays.toString(intStream.toArray()));

        Prototype prototype = new Prototype("Oleg","Omsk",25,"89234562378");
        Prototype prototype1 = prototype.clone();
        System.out.println(prototype1);

        Water water = new Water();
        System.out.println(water);
        water.freeze();
        System.out.println(water);
        water.heat();
        System.out.println(water);
        water.heat();
        System.out.println(water);

        NewsPaper newsPaper = new NewsPaper();
        GoodCritic Vasiliy = new GoodCritic("Vasiliy");
        BadCritic Peter = new BadCritic("Peter");
    }
}