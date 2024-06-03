package PatternsRealisation.Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {
    private String title;
    private String[] topping;
    private Integer price;

    public IceCream(String title, String[] topping, Integer price) {
        this.title = title;
        this.topping = topping;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getTopping() {
        return topping;
    }

    public void setTopping(String[] topping) {
        this.topping = topping;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "title='" + title + '\'' +
                ", topping=" + Arrays.toString(topping) +
                ", price=" + price +
                '}';
    }
}