package Arrays;

import java.util.Scanner;

public class Array_snake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++){
            if (i % 2 == 0)
                for (int j = 0; j < m; j++) arr[i][j] += count++;
            else
                for (int j = m-1; j >= 0; j--) arr[i][j] += count++;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}