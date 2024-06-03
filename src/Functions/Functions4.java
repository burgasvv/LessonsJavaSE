package Functions;

import java.util.Scanner;

public class Functions4 {
    static void BubbleSort(int[] arr, boolean asc){

        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++){

                if (arr[j] > arr[j+1] == asc){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if (arr[j] == arr[j+1]) arr[j+1] += 1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];
        int[][] arr2 = new int[n][n];
        int count = 0;

        for (int i = 0; i < n; i++){

            arr[i] = (int)(Math.random() * 30 + 20);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        BubbleSort(arr, true);

        for (int i = 0; i < n; i++) System.out.print(arr[i] + "\t");

        System.out.println("\n");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) arr2[i][j] = count++;

        for (int i = 0; i < n; i++) BubbleSort(arr2[i], i % 2 == 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(arr2[i][j] + "\t");
            System.out.println();
        }
    }
}