package DesignPatterns.State;

public class Ice extends WaterState{
    @Override
    public void heat(Water water) {
        water.setWaterState(new Liquid());
    }
    @Override
    public void freeze(Water water) {

    }
}