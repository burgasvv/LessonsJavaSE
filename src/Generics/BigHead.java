package Generics;

public class BigHead extends Head {
    public BigHead(String model) {
        super(model);
    }
    public void burn(){
        System.out.println("Burn");
    }
    @Override
    public String toString() {
        return "BigHead{" +
                "model='" + model + '\'' +
                '}';
    }
}