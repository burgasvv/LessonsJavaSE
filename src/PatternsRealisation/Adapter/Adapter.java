package PatternsRealisation.Adapter;

public class Adapter extends BatteryA{

    public Adapter(BatteryB batteryB) {
        super(batteryB.getModel(),
                batteryB.getEnergy()*5);
    }
}
