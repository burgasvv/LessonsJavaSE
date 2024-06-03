package Inheritance;

public class Tiger extends Cat{
    public Tiger(int age, double weight) {
        super("Tiger",age, weight);
    }
    @Override
    public String Voice(){
        return "Rawwww";
    }
}
