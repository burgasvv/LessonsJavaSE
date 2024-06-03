package DesignPatterns.Memento;

public class CatSaver {

    private final Cat cat;

    public CatSaver() {
        cat = new Cat();
    }
    public Cat save(){
        return cat;
    }
    public void load(Cat cat){
        cat.setName(cat.getName());
        cat.setAge(cat.getAge());
        cat.setWeight(cat.getWeight());
    }
}