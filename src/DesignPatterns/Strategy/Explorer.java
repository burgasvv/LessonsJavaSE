package DesignPatterns.Strategy;

public class Explorer {
    private Movable movable;
    public Explorer(Movable movable) {
        this.movable = movable;
    }
    public Movable getMovable() {
        return movable;
    }
    public void setMovable(Movable movable) {
        this.movable = movable;
    }

}