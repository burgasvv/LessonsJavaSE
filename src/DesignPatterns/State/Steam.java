package DesignPatterns.State;

public class Steam extends WaterState{
    @Override
    public void heat(Water water) {

    }
    @Override
    public void freeze(Water water) {
        water.setWaterState(new Liquid());
    }
}