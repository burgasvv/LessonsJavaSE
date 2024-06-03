package VariablesAndLoops;

import java.util.Scanner;
public class Divination {
    public static void main(String[] argc){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите любое число, чтобы узнать сумму делителей: ");
        int n = scan.nextInt();
        int x;
        x = n;
        int sum = 0;

        if (n > 0){
            while (x != 0){
                if (n % x == 0){
                    sum = sum + x;
                }
                x--;
            }
        }
        else {
            while (x != 0){
                if (n % x == 0){
                    sum = sum + x;
                }
                x++;
            }
        }
        System.out.println("Сумма делителей: " + sum);
    }
}