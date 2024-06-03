package PatternsRealisation.Strategy;

public class Explorer {
    private String name;
    private Integer age;
    private IMovable movable;
    private IFlyable flyable;
    public Explorer(String name, Integer age, IMovable movable) {
        this.name = name;
        this.age = age;
        this.movable = movable;
    }
    public Explorer(String name, Integer age, IFlyable flyable) {
        this.name = name;
        this.age = age;
        this.flyable = flyable;
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

    public IMovable getMovable() {
        return movable;
    }

    public void setMovable(IMovable movable) {
        this.movable = movable;
    }

    public IFlyable getFlyable() {
        return flyable;
    }

    public void setFlyable(IFlyable flyable) {
        this.flyable = flyable;
    }

    public void move(){
        movable.move();
    }
    public void fly(){
        flyable.fly();
    }

    @Override
    public String toString() {
        return "Explorer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}