package DataStructures;

public class Person {
    private String name;
    private int age;
    private Phone phone;
    public Person(String name, int age, Phone phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public Person(Person person){
        this.name = person.getName();
        this.age = person.getAge();
        this.phone = person.getPhone();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Phone getPhone() {return phone;}
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    public String toString(){
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Phone: " + getPhone();
    }
    public Person clone(){
        return new Person(getName(), getAge(), getPhone());
    }

    public static void main(String[] args) {
        Person person = new Person("Igor", 33, new Phone(913, 8546122));
        Person person1 = person.clone();
        Person person2 = new Person(person1);
        person1.setPhone(new Phone(903, 7894563));
        System.out.println(person1);
        System.out.println(person2);
    }
}