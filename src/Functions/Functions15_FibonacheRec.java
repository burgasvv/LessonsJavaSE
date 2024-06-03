package Functions;

import java.util.Scanner;

public class Functions15_FibonacheRec {

    static int Fib(int n){

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return Fib(n-1) + Fib(n-2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Fib(n));
    }
}
