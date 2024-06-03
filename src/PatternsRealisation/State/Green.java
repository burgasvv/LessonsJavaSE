package PatternsRealisation.State;

public class Green implements ILightState{

    private final String colour;

    public Green() {
        colour = "Green";
    }

    @Override
    public void previous(Light light) {
        light.setLightState(new Yellow());
    }

    @Override
    public void next(Light light) {

    }

    @Override
    public String toString() {
        return "Green{" +
                "colour='" + colour + '\'' +
                '}';
    }
}