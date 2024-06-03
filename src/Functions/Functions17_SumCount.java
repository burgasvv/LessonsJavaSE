package Functions;

import java.util.Scanner;

public class Functions17_SumCount {

    static int count = 0;
    static void SumCount(int a, int b, int c, int d, int x){

        if (a + b + c + d == x){
            System.out.println(a + " " + b + " " + c + " " + d);
            count++;
        }
        if (d < x)
            SumCount(a, b, c, d+1, x);
        else if (c < x)
            SumCount(a, b, c+1, c+1, x);
        else if (b < x)
            SumCount(a, b+1, b+1, b+1, x);
        else if (a < x)
            SumCount(a+1, a+1, a+1, a+1, x);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        SumCount(1, 1, 1, 1, x);
        System.out.println(count);
    }
}