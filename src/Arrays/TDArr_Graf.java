package Arrays;

import java.util.Scanner;

public class TDArr_Graf {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] graf = new int[n][n];
        int c = 0;

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                graf[i][j] = scan.nextInt();

                c += graf[i][j];
            }

        }
        System.out.println(c / 2);
    }
}