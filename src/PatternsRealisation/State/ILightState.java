package PatternsRealisation.State;

public interface ILightState {
    void previous(Light light);

    void next(Light light);
}
