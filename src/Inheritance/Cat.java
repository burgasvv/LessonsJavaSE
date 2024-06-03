package Inheritance;

public class Cat {
    private String name;
    private final int age;
    private final double weight;
    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public String Voice(){
        return "Meow";
    }
    public String toString(){
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Weight: " + getWeight();
    }
}