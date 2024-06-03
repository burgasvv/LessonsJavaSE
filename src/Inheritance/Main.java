package Inheritance;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(6,10.6);
        System.out.println(tiger.Voice());
        System.out.println(tiger);
        Lion lion = new Lion(8,35.5);
        System.out.println(lion.Voice());
        System.out.println(lion);
    }
}