package Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Triangle(3,4,5);
        System.out.println(figure.S());
        Animal buffalo = new Buffalo(200);
        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(new Camel(120));
        animals.add(new Monkey(40));
        animals.add(buffalo);
        animals.add(new Parrot(1));
        Parrot parrot = (Parrot) animals.get(3);

        for (Animal animal : animals) {
            animal.Feed();
            if (animal instanceof Parrot) {
                parrot.Fly();
            }
        }
    }
}