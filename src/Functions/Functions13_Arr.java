package Functions;

import java.util.Scanner;

public class Functions13_Arr {
    public static void FillArr(int[][] arr, int n, int m){

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) arr[i][j] = (int)(Math.random() * 30 + 20);

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
    }
    public static void SortArr(int[][] arr, int n, int m) {

        for (int i = 0; i < n; i++){

            boolean sort = false;

            while (!sort){

                sort = true;

                for (int j = 0; j < m-1; j++) {

                    if (arr[i][j] > arr[i][j+1]){

                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j+1];
                        arr[i][j+1] = temp;

                        sort = false;
                    }
                    if (arr[i][j] == arr[i][j+1])
                        arr[i][j+1] += 1;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];

        FillArr(arr, n, m);
        SortArr(arr, n, m);
    }
}