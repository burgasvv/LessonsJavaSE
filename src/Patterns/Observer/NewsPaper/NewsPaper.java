package Patterns.Observer.NewsPaper;

public class NewsPaper extends Observable {
    public void newArticle(String article){
        System.out.println("Critics saying: "+article);
        Notify();
    }
}