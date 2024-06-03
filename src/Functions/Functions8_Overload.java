package Functions;

import java.util.Scanner;

public class Functions8_Overload {

    static double Sq(double r){

        double S = 3.14 * Math.pow(r, 2);
        return S;
    }
    static double Sq(int a, int b){

        double S = a * b;
        return S;
    }
    static double Sq(double a, double b, double c){

        double p = (a+b+c) / 2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(Sq(5));
        System.out.println(Sq(5, 7));
        System.out.println(Sq(5, 7, 9));
    }
}