package Arrays;

import java.util.Scanner;

public class TDArray_2bit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), m = scan.nextInt();
        int[][] arr = new int[n][m];
        int count = 0;

        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){

                arr[i][j] = count++ % 2;
                System.out.print(arr[i][j] + "\t");
            }
            count++;
            System.out.println();
        }
    }
}
