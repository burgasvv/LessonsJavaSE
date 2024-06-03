package DesignPatterns.Memento;

import java.util.ArrayList;

public class CatList {
    private final ArrayList<Cat>cats;

    public CatList() {
        cats = new ArrayList<>();
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public void add(Cat cat){
        cats.add(cat);
    }

    public void remove(Cat cat){
        cats.add(cat);
    }

    public Cat get(int index){
        return cats.get(index);
    }
}