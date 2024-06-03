package Functions;

import java.util.Scanner;

public class Functions3 {

    static boolean Check(int n, int num){

        return n % num == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 2; i < n; i++){

            if (Check(n, i)){

                System.out.println("Сосотавное число.");
                return;
            }
        }
        System.out.println("Простое число");
    }
}