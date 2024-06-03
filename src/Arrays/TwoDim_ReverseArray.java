package Arrays;

import java.util.Scanner;

public class TwoDim_ReverseArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){

                arr[i][j] = count++;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = n-1; i >= 0; i--){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
