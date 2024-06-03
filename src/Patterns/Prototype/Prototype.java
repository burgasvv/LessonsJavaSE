package Patterns.Prototype;

public class Prototype { // Pattern "prototype" копирование с изменениями
    private String name, city, phone;
    private int age;
    public Prototype(Prototype prototype) {
        setName(prototype.getName());
        setCity(prototype.getCity());
        setAge(prototype.getAge());
        setPhone(prototype.getPhone());
    }
    public Prototype(String name, String city, int age, String phone) {
        setName(name);
        setCity(city);
        setAge(age);
        setPhone(phone);
    }
    @Override
    public Prototype clone() {
        return new Prototype(name,city,age,phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}