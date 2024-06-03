package ArrayList;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Integer getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String toString(){return "Name: " + getName() + " " + "Age: " + getAge();}
}