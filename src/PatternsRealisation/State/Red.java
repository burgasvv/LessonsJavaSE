package PatternsRealisation.State;

public class Red implements ILightState{

    private final String colour;

    public Red() {
        colour = "Red";
    }

    @Override
    public void previous(Light light) {

    }

    @Override
    public void next(Light light) {
        light.setLightState(new Yellow());
    }

    @Override
    public String toString() {
        return "Red{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
