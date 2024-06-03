package Strings;

import java.util.Scanner;

public class Strings9_WordCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scan.nextLine();
        String[] word = text.split("\\s+");
        System.out.println("Количество слов в тексте: " + word.length);
    }
}