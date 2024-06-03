package Patterns.Observer.NewsPaper;

public class BadCritic extends Subscriber{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public BadCritic(String name) {
        setName(name);
    }
    @Override
    public String Notify() {
        return name+"says: I think it's too bad";
    }
}
