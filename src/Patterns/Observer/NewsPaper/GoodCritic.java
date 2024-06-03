package Patterns.Observer.NewsPaper;

public class GoodCritic extends Subscriber {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public GoodCritic(String name) {
        setName(name);
    }
    @Override
    public String Notify() {
        return name+" says: I think it's awesome";
    }
}