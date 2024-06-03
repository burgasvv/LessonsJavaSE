package Functions;

import java.util.Scanner;

public class Functions2 {

    static int Sum(int a, int b){return a + b;}

    static void test(int b){   // Массив изменяется в функциях, а переменные нет;
        b += 10;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int c = Sum(10, 15);
        c = Sum(c, c);
        System.out.println(c);

        int a = 10;
        test(a);
        System.out.println(a);

    }
}