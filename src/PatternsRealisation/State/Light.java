package PatternsRealisation.State;

public class Light {
    private ILightState lightState;

    public Light(ILightState lightState) {
        this.lightState = lightState;
    }

    public ILightState getLightState() {
        return lightState;
    }

    public void setLightState(ILightState lightState) {
        this.lightState = lightState;
    }
    public void previous(){
        lightState.previous(this);
    }

    public void next(){
        lightState.next(this);
    }

    @Override
    public String toString() {
        return "Light{" +
                "lightState=" + lightState +
                '}';
    }
}
