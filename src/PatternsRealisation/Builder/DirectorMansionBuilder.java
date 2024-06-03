package PatternsRealisation.Builder;

public class DirectorMansionBuilder {
    private final IBuilder builder;

    public DirectorMansionBuilder() {
        builder = new MansionBuilder();
    }

    public IBuilder getBuilder() {
        return builder;
    }
    public Structure getMansion(){
        return builder.getTitle().getMaterials().getFloors().getPool().getColour().getPrice().getStructure();
    }
}
