package Arrays;

import java.util.Scanner;

public class Arrays_Diffout {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0)
                for (int j = 0; j < n; j++) arr[i][j] = count++;
            else
                for (int j = n - 1; j >= 0; j--) arr[i][j] = count++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
    }
}