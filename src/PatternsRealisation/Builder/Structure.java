package PatternsRealisation.Builder;

import java.util.Arrays;

public class Structure {
    private String title;
    private String materials;
    private Integer floors;
    private Boolean isPool;
    private String colour;
    private  Integer price;

    public Structure() {
    }

    public Structure(String title, String materials, Integer floors, Boolean isPool, String colour, Integer price) {
        this.title = title;
        this.materials = materials;
        this.floors = floors;
        this.isPool = isPool;
        this.colour = colour;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String ...materials) {
        this.materials = Arrays.toString(materials);
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Boolean getPool() {
        return isPool;
    }

    public void setPool(Boolean pool) {
        isPool = pool;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String ...colour) {
        this.colour = Arrays.toString(colour);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Structure{" +
                "title='" + title + '\'' +
                ", materials='" + materials + '\'' +
                ", floors=" + floors +
                ", isPool=" + isPool +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
