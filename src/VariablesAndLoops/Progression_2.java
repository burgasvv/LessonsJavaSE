package VariablesAndLoops;

import java.util.Scanner;

public class Progression_2 {
    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int d = b - a;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n + 1; i++){

            a = d + b;
            System.out.print(a + " ");

            b = a + d;
            System.out.print(b + " ");
        }
    }
}