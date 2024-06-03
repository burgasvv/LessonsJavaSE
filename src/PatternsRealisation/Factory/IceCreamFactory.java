package PatternsRealisation.Factory;

public class IceCreamFactory {
    public IceCream getIceCream(int index){
        switch (index){
            case 1 -> {
                return new ChocolateIceCream().getIceCream();
            }
            case 2 -> {
                return new CreamBruleIceCream().getIceCream();
            }
        }
        return null;
    }
}