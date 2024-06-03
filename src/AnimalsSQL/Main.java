package AnimalsSQL;

import java.util.ArrayList;

public class Main {
    static void ShowCats(ArrayList<Cat>cats){
        for (Cat cat : cats) {
            System.out.println("********************");
            System.out.println("Name: " + cat.getName());
            System.out.println("Age: " + cat.getAge());
            System.out.println("Breed: " + cat.getBreed());
        }
    }
    public static void main(String[] args) {
        Cat cat = new Cat(6,"Test", 3, "Test");
        CatsContext context = new CatsContext();
        String[][] params = new String[1][3];
        params[0][0] = "age";
        params[0][1] = "<";
        params[0][2] = "7";
        ArrayList<Cat>cats = context.select(params);
        ShowCats(cats);
    }
}