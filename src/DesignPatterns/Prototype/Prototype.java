package DesignPatterns.Prototype;

import DesignPatterns.Singletone.Singletone;

public class Prototype implements Cloneable{
    private Singletone singletone;
    public Singletone getSingletone() {
        return singletone;
    }
    public void setSingletone(Singletone singletone) {
        this.singletone = singletone;
    }
    public Prototype(Singletone singletone) {
        this.singletone = singletone;
    }
    public Prototype(Prototype prototype) {
        this.singletone = prototype.getSingletone();
    }
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
    @Override
    public String toString() {
        return "Prototype{" +
                "singletone=" + singletone +
                '}';
    }
}