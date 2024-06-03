package Classes_OOP;

public class Book1 {
    private String title, author, genre;
    private int price;
    public Book1(String title, String author, String genre, int price){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }
    public void SetPrice(int price){
        this.price = price;
    }
    public int GetPrice(){return price;}
    public String GetGenre(){return genre;}
    public String GetTitle(){return title;}
    public String GetAuthor(){return author;}
    public void ShowInfo(){
        System.out.println("Name: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price + " Rub");
        System.out.println("-------------------------");
    }
}