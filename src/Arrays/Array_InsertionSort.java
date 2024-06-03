package Arrays;

import java.util.Scanner;

public class Array_InsertionSort {
    public static void InsertionSortArray(Integer[] arr){
        int j;
        for (int i = 1; i < arr.length; i++){
            int swap = arr[i];
            for (j = i; j > 0 && swap < arr[j-1]; j--)arr[j] = arr[j-1];
            arr[j] = swap;
        }
    }
    public static void FillArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++) arr[i] = (int)(Math.random() * 80 + 20);
    }
    public static void PrintArray(Integer[] arr){
        for (Integer integer : arr) System.out.print(integer + "\t");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        FillArray(arr);
        PrintArray(arr);
        InsertionSortArray(arr);
        PrintArray(arr);
    }
}