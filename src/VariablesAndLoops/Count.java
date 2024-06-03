package VariablesAndLoops;

import java.util.Scanner;

public class Count {
    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int n = 123456789;
        System.out.println(n / 1000);
        System.out.println(n % 1000);
        System.out.println(n / 10);
        System.out.println(n % 10);
        System.out.println();

        n = n / 1000;
        n = n % 1000;
        System.out.println(n);

        int a = 10, b = 20;
        a = a + b; // 30
        b = a - b; // 10
        a = a - b; // 20
        System.out.println(a + " " + b);

        int c = a; // 10
        a = b; // 20
        b = c; // 10
        System.out.println(a + " " + b);

        n = 89567;
        while (n != 0){
            System.out.print(n % 2);
            n = n / 2;
        }

        n = 349875;
        System.out.println();
        while (n != 0){

            switch (n % 16){
                case 10:
                    System.out.print("A"); break;
                case 11:
                    System.out.print("B"); break;
                case 12:
                    System.out.print("C"); break;
                case 13:
                    System.out.print("D"); break;
                case 14:
                    System.out.print("E"); break;
                case 15:
                    System.out.print("F"); break;
                default:
                    System.out.print(n % 16); break;
            }
            n = n / 16;
        }

        double d = Math.random() * 325 - 75;
        int db = (int)d;
        System.out.println("\n\n" + db);
        System.out.println();

        n = 2345;
        int p = 0;
        while (n != 0){

            p += n % 2;
            System.out.print(n % 2);
            n /= 2;

        }

        System.out.println("\n" + p);

        int x = scan.nextInt();
        int max = 0, min = 30000;

        for (int i = 0; i < x; i++){

            int mass = scan.nextInt();

            if (mass > max)
                max = mass;

            if (mass < min)
                min = mass;

        }
        System.out.println(max + " " + min);
        System.out.println();

    }
}