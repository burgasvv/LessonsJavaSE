package Classes_OOP;
import java.util.Scanner;

public class BookStore1 {
    private Book1[] books;
    public BookStore1(Book1[] books){
        this.books = books;
    }
    public void InsertBook(Book1 book){
        Book1[] temp = new Book1[books.length+1];
        for (int i = 0; i < books.length; i++)
            temp[i] = books[i];
        temp[books.length] = book;
        books = temp;
    }
    public Book1 CreateBook(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert title: ");
        String title = scan.nextLine();
        System.out.println("Insert author: ");
        String author = scan.nextLine();
        System.out.println("Insert genre: ");
        String genre = scan.nextLine();
        System.out.println("Insert price: ");
        int price = scan.nextInt();
        return new Book1(title, author, genre, price);
    }
    public void DeleteBook(Book1 book){
        int I = 0;
        Book1[] temp = new Book1[books.length-1];
        for (int i = 0; i < books.length; i++){
            if (books[i] != book)
                temp[I++] = books[i];
        }
        books = temp;
    }
    public Book1[] GetBooks() {return books;}
    public void ShowAll(){
        for (int i = 0; i < books.length; i++)
            books[i].ShowInfo();
    }
    public void FilteredByTitle(String title){
        for (int i = 0; i < books.length; i++)
            if (title.equalsIgnoreCase(books[i].GetTitle()))
                books[i].ShowInfo();
    }
    public void FilteredByAuthor(String author){
        for (int i = 0; i < books.length; i++)
            if (author.equalsIgnoreCase(books[i].GetAuthor()))
                books[i].ShowInfo();
    }
    public void FilteredByGenre(String genre){
        for (int i = 0; i < books.length; i++)
            if (genre.equalsIgnoreCase(books[i].GetGenre()))
                books[i].ShowInfo();
    }
    public void FilteredByPrice(){
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - 1; j++) {
                if (books[j].GetPrice() > books[j + 1].GetPrice()) {
                    Book1 temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}