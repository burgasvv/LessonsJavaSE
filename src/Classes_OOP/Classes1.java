package Classes_OOP;

import java.util.Scanner;

public class Classes1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book1[] books = new Book1[10];
        books[0] = new Book1("Dune", "Framk Gerbert", "Fantastic", 1000);
        books[1] = new Book1("Game of Ender", "Orson Scott", "Fantastic", 700);
        books[2] = new Book1("Bun", "Narod", "Fairy tale", 300);
        books[3] = new Book1("Shadow and Sparks", "Jennifer Armentrout", "Fantasy", 500);
        books[4] = new Book1("A Soul of Ash and Blood", "Jennifer Armentrout", "Fantasy", 450);
        books[5] = new Book1("Caroline", "Neil Geyman", "Detective", 600);
        books[6] = new Book1("Disastrous Influence", "Mike Omer", "Detective", 650);
        books[7] = new Book1("Thirteen Card", "Mike Omer", "Detective", 550);
        books[8] = new Book1("Scarlet", "Marissa Meyer", "Fairy tale", 260);
        books[9] = new Book1("Cinder", "Marissa Meyer", "Fairy tale", 280);
        BookStore1 store = new BookStore1(books);

        while (true){
            System.out.println("What to do?" + "\n\t1 .Show All."
                    + "\n\t2. Title." + "\n\t3. Author." + "\n\t4. Genre." + "\n\t5. Price."
                    + "\n\t6. Add new library." + "\n\t7. Delete book from library." + "\n\t8. Quit.");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    store.ShowAll();
                    break;
                case 2:
                    System.out.println("What title?");
                    String title = scan.nextLine();
                    store.FilteredByTitle(title);
                    break;
                case 3:
                    System.out.println("What author?");
                    String author = scan.nextLine();
                    store.FilteredByAuthor(author);
                    break;
                case 4:
                    System.out.println("What genre?");
                    String genre = scan.nextLine();
                    store.FilteredByGenre(genre);
                    break;
                case 5:
                    store.FilteredByPrice();
                    break;
                case 6:
                    store.InsertBook(store.CreateBook());
                    break;
                case 7:
                    System.out.println("What book for delete?");
                    String title2 = scan.next();
                    for (int i = 0; i < store.GetBooks().length ; i++){
                        if (store.GetBooks()[i].GetTitle().compareToIgnoreCase(title2) == 0){
                            System.out.println("Really?");
                            store.GetBooks()[i].ShowInfo();
                            char s = scan.next().charAt(0);
                            if (s == 'Y' || s == 'y' || s == 'Д' || s == 'д')
                                store.DeleteBook(store.GetBooks()[i]);
                        }
                    }
                    break;
                case 8:
                    System.out.println("See you later and goodluck.");
                    return;
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}