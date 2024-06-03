package Patterns.Strategy.Movable;

public class Explorer { // pattern "Strategy" меняет стратегию действия
    private Movable movable;
    public Explorer() {
        movable = new Car();
    }
    public void changeTransport(Movable movable){
        this.movable = movable;
    }
    public String move(){
        return movable.move();
    }
}