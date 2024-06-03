package Patterns.State;

public class Liquid extends WaterState{
    @Override
    public void heat(Water water) {
        water.setWaterState(new Steam());
    }
    @Override
    public void freeze(Water water) {
        water.setWaterState(new Ice());
    }
}