package PatternsRealisation.Builder;

public interface IBuilder {
    IBuilder getTitle();
    IBuilder getMaterials();
    IBuilder getFloors();
    IBuilder getPool();
    IBuilder getColour();
    IBuilder getPrice();
    Structure getStructure();
}