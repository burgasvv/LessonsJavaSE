package Functions;

import java.util.Scanner;

public class Functions6 {

    static void SquareD(double a, double b, double c){

        double D = ((Math.pow(b, 2)) - 4*a*c);

        if (D < 0) System.out.println("Нет корней.");
        else if (D == 0) System.out.println(-b / (2*a));
        else if (D > 0){
            System.out.println((-b + Math.sqrt(D)) / (2*a));
            System.out.println((-b - Math.sqrt(D)) / (2*a));
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        SquareD(2, -1, -5);
    }
}