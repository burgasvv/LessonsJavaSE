package Functions;

import java.util.Scanner;
public class Functions {

    static void ShowArray(int[] arr, int n){

        for (int i = 0; i < n; i++) System.out.print(arr[i] + "\t");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = (int)(Math.random() * 20 - 10);
        ShowArray(arr, n);

        for (int i = 0; i < n; i++) arr[i] = Math.abs(arr[i]);
        ShowArray(arr, n);

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++){

                if (arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if (arr[j] == arr[j+1]){

                    arr[j+1] += 1;
                }
            }
        }
        ShowArray(arr, n);
    }
}