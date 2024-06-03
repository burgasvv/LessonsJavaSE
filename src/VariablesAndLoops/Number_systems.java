package VariablesAndLoops;

import java.util.Scanner;

public class Number_systems {

    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        System.out.print("Num system 10: ");
        int n = scan.nextInt();
        int c = 0;

        System.out.print("Num system 16: ");
        while (n != 0){

            switch (n % 16) {
                case 10 -> {
                    System.out.print('A');
                    c++;
                }
                case 11 -> {
                    System.out.print('B');
                    c++;
                }
                case 12 -> {
                    System.out.print('C');
                    c++;
                }
                case 13 -> {
                    System.out.print('D');
                    c++;
                }
                case 14 -> {
                    System.out.print('E');
                    c++;
                }
                case 15 -> {
                    System.out.print('F');
                    c++;
                }
                default -> System.out.print(n % 16);
            }

            n /= 16;
        }
        System.out.println("\n" + c);

        System.out.print("Num system 10: ");
        n = scan.nextInt();

        System.out.print("Num system 2: ");

        c = 0;

        while (n != 0){

            System.out.print(n % 2);

            if (n % 2 == 1)
                c++;

            n /= 2;
        }

        System.out.println("\n" + c);
    }
}