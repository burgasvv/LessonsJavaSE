package BullsCowsSQL;

public class User {
    private int id;
    private String name;
    private int score;
    public User(){}
    public User(int id, String name, int score) {
        this.id = id;
        setName(name);
        setScore(score);
    }
    public User(String name, int score) {
        setName(name);
        setScore(score);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void getUser(){
        System.out.println("---------------------------\nName: "+getName()+"\nScore: "+getScore());
    }
}