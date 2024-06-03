package Generics;

public class Main {
    public static void main(String[] args) {
        Robot<BigHead>robot = new Robot<>(new Body("WR-505"), new BigHead("HR-325"));
        System.out.println(robot);
    }
}