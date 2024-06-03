package Functions;

import java.util.Scanner;

public class Functions9_GlobalVal {

    static int red = 0, blue = 0, green = 0, black = 0; // Глобальные переменные;
    static void Colour(int n){

        if (n % 5 == 0)
            blue++;
        else if (n % 3 == 0)
            green++;
        else if (n % 2 == 0)
            red++;
        else
            black++;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), m = scan.nextInt();

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                Colour(i * j);

        System.out.println("Red: " + red);
        System.out.println("Green: " + green);
        System.out.println("Blue: " + blue);
        System.out.println("Black: " + black);
    }
}