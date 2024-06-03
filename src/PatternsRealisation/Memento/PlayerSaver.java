package PatternsRealisation.Memento;

public class PlayerSaver {
    private String name;
    private Integer age;

    public Player save(){
        return new Player(name,age);
    }
    public void load(Player player){
        name = player.getName();
        age = player.getAge();
    }
}
