package Functions;

import java.util.Scanner;

public class Functions14_ArrFunc {

    public static void SnakeArr(int[][] arr, int n, int m){

        int count = 0;

        for (int i = 0; i < n; i++){

            if (i % 2 == 0) for (int j = 0; j < m; j++) arr[i][j] = count++;
            else for (int j = m-1; j >= 0; j--) arr[i][j] = count++;
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
    public static void FillArr(int[][] arr, int n, int m){

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){

                arr[i][j] = (int)(Math.random() * 40 + 10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void SortArr(int[][] arr, int n, int m){

        for (int i = 0; i < n; i++){

            boolean sort = false;
            while (!sort){

                sort = true;

                for (int j = 0; j < m-1; j++){

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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        FillArr(arr, n, m);
        SortArr(arr, n, m);
        SnakeArr(arr, n, m);
    }
}