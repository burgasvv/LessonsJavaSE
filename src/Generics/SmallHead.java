package Generics;

public class SmallHead extends Head {
    public SmallHead(String model) {
        super(model);
    }
    public void talk(){
        System.out.println("Talk");
    }
    @Override
    public String toString() {
        return "SmallHead{" +
                "model='" + model + '\'' +
                '}';
    }
}