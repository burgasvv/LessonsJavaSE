package PatternsRealisation.State;

public class Yellow implements ILightState{

    private final String colour;

    public Yellow() {
        colour = "Yellow";
    }

    @Override
    public void previous(Light light) {
        light.setLightState(new Red());
    }

    @Override
    public void next(Light light) {
        light.setLightState(new Green());
    }

    @Override
    public String toString() {
        return "Yellow{" +
                "colour='" + colour + '\'' +
                '}';
    }
}