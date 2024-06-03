package Functions;

import java.util.Scanner;

public class Functions18_SumNum {
    static int a = 0, n = 1, c = 0, count = 0;
    static int SumNum(int n){

        int sum = 0;
        for (int i = n; i > 0; i /= 10){

            sum += i%10;
            c++;
        }
        return sum;
    }
    static int Numbers(int a, int b){

        while (true){

            if (SumNum(n) != b)
                n++;
            else {
                count++;
                n++;
            }
            if (c > a)
                return count;
            else
                c = 0;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        int b = scan.nextInt();
        n = (int)(Math.pow(10, a-1));
        System.out.println(Numbers(a, b));
    }
}