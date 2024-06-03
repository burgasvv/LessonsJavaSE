package Strings;

import java.util.Scanner;

public class Strings4_Gods {
    static int CountMistakes(String first, String second){

        int count = 0;
        int n = first.length();
        for (int i = 0; i < n; i++)
            count += first.charAt(i) != second.charAt(i) ? 1 : 0;

        return count;
    }
    static String[] InputGods(int n){

        Scanner scan = new Scanner(System.in);
        String[] result = new String[n];
        for (int i = 0; i < n; i++)
            result[i] = scan.next();

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] first = InputGods(n);
        int[] mistakes = new int[n];

        int m = scan.nextInt();
        String[] second = InputGods(m);

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                if (first[i].length() == second[j].length())
                    mistakes[i] += CountMistakes(first[i], second[j]) == 1 ? 1:0;
            }
            System.out.print(mistakes[i] + " ");
        }
    }
}