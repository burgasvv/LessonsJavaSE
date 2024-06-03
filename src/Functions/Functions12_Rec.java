package Functions;

import java.util.Scanner;

public class Functions12_Rec {

    static void Count(int x){

        if (x < 100){
            System.out.println(x);
            Count(x+1);
        }
    }
    static int F(int x){

        if (x == 0)
            return 1;
        return F(x-1) * x;
    }
    static double P(double a, double b){

        if (b == 0)
            return 1;
        else if (b < 0)
            return P(a, b+1) / a;
        else
            return P(a, b-1) * a;
    }
    static boolean P2(int a){
        if (a == 2)
            return true;
        if (a % 2 != 0)
            return false;

        return P2(a/2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(F(5));
        System.out.println(P(2, -2));
        System.out.println(P2(100));
    }
}