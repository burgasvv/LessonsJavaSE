package Strings;

import java.util.Scanner;

public class Strings7_Words {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arrWord = new String[n];
        String[] arrStr = new String[20];
        for (int i = 0; i < arrWord.length; i++)
            arrWord[i] = scan.next();
        for (int i = 0; i < arrWord.length-1; i++){
            for (int j = 0; j < arrWord[i].length(); j++){
                if (arrWord[i].charAt(j) == arrWord[i+1].charAt(j))
                    arrStr[j] = String.valueOf(arrWord[i].charAt(j));
            }
        }
        String Search = String.join("", arrStr);
        System.out.println("\n" + Search);
    }
}