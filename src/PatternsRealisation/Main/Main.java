package PatternsRealisation.Main;

import PatternsRealisation.Adapter.Adapter;
import PatternsRealisation.Adapter.BatteryB;
import PatternsRealisation.Builder.DirectorMansionBuilder;
import PatternsRealisation.Decorator.ArrayClass;
import PatternsRealisation.Decorator.ArrayConcrete;
import PatternsRealisation.Decorator.ArrayPositive;
import PatternsRealisation.Decorator.ArraySortNaturalOrder;
import PatternsRealisation.Factory.IceCreamFactory;
import PatternsRealisation.Memento.Player;
import PatternsRealisation.Memento.PlayerHistory;
import PatternsRealisation.Memento.PlayerSaver;
import PatternsRealisation.Observer.ObserverList;
import PatternsRealisation.Observer.Student;
import PatternsRealisation.Observer.Worker;
import PatternsRealisation.Prototype.Car;
import PatternsRealisation.Singleton.Human;
import PatternsRealisation.State.Light;
import PatternsRealisation.State.Red;
import PatternsRealisation.Strategy.Explorer;
import PatternsRealisation.Strategy.Plane;

public class Main {
    public static void main(String[] args) {

        //Singleton;
        Human human = Human.getHuman();
        System.out.println(human);
        Human human1 = Human.getHuman();
        System.out.println(human1);
        human.setName("Slava");
        human.setAge(30);
        System.out.println(human);
        human1.setName("Ruslan");
        human1.setAge(30);
        System.out.println(human1);

        //Prototype;
        Car car = new Car("BMW",1000000000);
        Car car1 = car.cloneCar();
        System.out.println(car);
        System.out.println(car1);
        Car car2 = new Car(car);
        System.out.println(car2);

        //Memento;
        PlayerSaver saver = new PlayerSaver();
        saver.load(new Player("Slava", 30));
        PlayerHistory history = new PlayerHistory();
        history.add(saver.save());
        saver.load(new Player("Ruslan",30));
        history.add(saver.save());
        System.out.println(history.getPlayers());

        //Adapter;
        Adapter adapter = new Adapter(new BatteryB("ARG45",505));
        System.out.println(adapter);

        //Decorator;
        ArrayClass arrayClass = new ArrayConcrete(new Integer[25]);
        arrayClass.apply();
        System.out.println(arrayClass);
        arrayClass = new ArrayPositive(arrayClass);
        arrayClass.apply();
        System.out.println(arrayClass);
        arrayClass = new ArraySortNaturalOrder(arrayClass);
        arrayClass.apply();
        System.out.println(arrayClass);

        //Observer;
        ObserverList list = new ObserverList();
        list.add(new Student("Slava",30));
        list.add(new Worker("Ruslan",30));
        list.message();

        //Strategy;
        Explorer explorer =
                new Explorer("Slava",30, new PatternsRealisation.Strategy.Car("BMW",15));
        explorer.move();
        explorer.setFlyable(new Plane("s7",150));
        explorer.fly();

        //State;
        Light light = new Light(new Red());
        System.out.println(light);
        light.next();
        System.out.println(light);
        light.next();
        System.out.println(light);

        //Factory;
        IceCreamFactory factory = new IceCreamFactory();
        System.out.println(factory.getIceCream(1));

        //Builder;
        DirectorMansionBuilder director = new DirectorMansionBuilder();
        System.out.println(director.getMansion());
    }
}