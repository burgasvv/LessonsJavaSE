package PatternsRealisation.Builder;

public class MansionBuilder implements IBuilder{
    private final Structure mansion;

    public MansionBuilder() {
        mansion = new Structure();
    }

    @Override
    public IBuilder getTitle() {
        mansion.setTitle("Burgas Mansion");
        return this;
    }

    @Override
    public IBuilder getMaterials() {
        mansion.setMaterials("Stone","Bricks","Sandwich Panels","Metal","Glass","Wood");
        return this;
    }

    @Override
    public IBuilder getFloors() {
        mansion.setFloors(4);
        return this;
    }

    @Override
    public IBuilder getPool() {
        mansion.setPool(true);
        return this;
    }

    @Override
    public IBuilder getColour() {
        mansion.setColour("Beige","Coral");
        return this;
    }

    @Override
    public IBuilder getPrice() {
        mansion.setPrice(50_000_000);
        return this;
    }

    @Override
    public Structure getStructure() {
        return mansion;
    }
}