package Functions;

import java.util.Scanner;

public class Functions7_Overload {

    static int FaktN(int n){

        int res = 1;

        for (int i = 1; i <= n; i++) res *= i;

        return res;
    }
    static int Sum(int a, int b){

        return a + b;
    }
    static int Sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(FaktN(n));
        System.out.println(Sum(10, 5));
        System.out.println(Sum(10, 5, 25));
    }
}