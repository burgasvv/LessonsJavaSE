package Functions;

import java.util.Scanner;

public class Functions16_SumNum {

    static int SumNum(int n){

        if (n == 0)
            return 0;

        return SumNum(n / 10) + n % 10;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(SumNum(n));
    }
}