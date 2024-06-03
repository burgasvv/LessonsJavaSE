package PatternsRealisation.Singleton;

public class Human {
    private String name;
    private Integer age;
    private static Human human;

    private Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Human getHuman() {
        if (human == null)
            human = new Human();
        return human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}