package VariablesAndLoops;

import java.util.Scanner;

public class Progression {
    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();

        int c = a + b;
        System.out.print(a + " " + b + " ");

        for (int i = 0; i < n; i++){

            c = a + b;
            System.out.print(c + " ");

            a = b + c;
            System.out.print(a + " ");

            b = a + c;
            System.out.print(b + " ");
        }
    }
}