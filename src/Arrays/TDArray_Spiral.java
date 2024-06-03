package Arrays;

import java.util.Scanner;

public class TDArray_Spiral {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < m - i; j++)
                arr[i][j] = count++;

            for (int j = i + 1; j < n - i; j++)
                arr[j][m - 1 - i] = count++;

            for (int j = m - 2 - i; j >= i; j--)
                arr[n - 1 - i][j] = count++;

            for (int j = n - 2 - i; j > i; j--)
                arr[j][i] = count++;

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}