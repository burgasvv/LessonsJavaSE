package PatternsRealisation.Factory;

import java.util.ArrayList;
import java.util.List;

public class CreamBruleIceCream implements IFactory{

    @Override
    public IceCream getIceCream() {
        return new IceCream("Cream-Brule", new String[]{"Strawberry", "Apple"},120);
    }
}