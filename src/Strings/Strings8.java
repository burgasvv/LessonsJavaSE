package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Strings8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> letters = new ArrayList<>();
        System.out.print("Введите строку: ");
        String str = scan.nextLine();
        System.out.print("Введите колличество букв для поиска: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("Введите букву: ");
            String letter = scan.next();
            int c = str.split(letter, -1).length-1;
            letters.add(c);
        }
        System.out.println("Колличество каждой найденной буквы: " + letters);
    }
}