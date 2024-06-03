package PatternsRealisation.Factory;

public class ChocolateIceCream implements IFactory{
    @Override
    public IceCream getIceCream() {
        return new IceCream("Chocolate", new String[]{"Nuts","Cookies","Cacao"},150);
    }
}