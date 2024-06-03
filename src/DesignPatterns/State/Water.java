package DesignPatterns.State;

public class Water {
    private WaterState waterState;

    public Water(WaterState waterState) {
        this.waterState = waterState;
    }
    public WaterState getWaterState() {
        return waterState;
    }
    protected void setWaterState(WaterState waterState) {
        this.waterState = waterState;
    }
    public void heat(){
        waterState.heat(this);
    }
    public void freeze(){
        waterState.freeze(this);
    }
    @Override
    public String toString() {
        return "Water{" +
                "waterState=" + waterState +
                '}';
    }
}