package VariablesAndLoops;

import java.util.Scanner;
public class Lucky_Ticket {
    public static void main(String[] argc){
        Scanner scan = new Scanner(System.in);
        char choice = '0';

        while (choice != 'y') {
            System.out.println("\nEnter a six-digit number: ");
            int number = scan.nextInt();

            if (number < 100000 || number > 999999) {
                System.out.println("Wrong number!");
            }
            int a = 0, b = 0, sum = 0;

            while (number != number%1000) {
                b += (number % 10);
                number /= 10;
            }
            while (number != 0) {
                a += (number % 10);
                number /= 10;
            }

            sum = a - b;

            if (a == b)
                System.out.println("Yes");
            else
                System.out.println("No");

            System.out.println("Do you want to exit the program? y/any key.");
            choice = scan.next().charAt(0);
        }
    }
}