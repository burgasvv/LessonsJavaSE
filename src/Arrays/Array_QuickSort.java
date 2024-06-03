package Arrays;

import java.util.Scanner;

public class Array_QuickSort {
    public static void QuickSort(Integer[] arr, int low, int high){
        if (arr.length == 0 || low >= high) return;
        int middle = low + (high-low) / 2;
        int border = arr[middle];
        int i = low, j = high;
        while (i <= j){
            while (arr[i] < border)i++;
            while (arr[j] > border)j--;
            if (i <= j){
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j) QuickSort(arr, low, j);
        if (high > i) QuickSort(arr, i, high);
    }
    public static void QuickSortMatrix(Integer[][] arr, int rows, int cols){
        Integer[] temp = new Integer[rows*cols];
        int k = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)temp[k++] = arr[i][j];
        QuickSort(temp, 0, temp.length-1);
        k = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) arr[i][j] = temp[k++];
    }
    public static void FillArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++)arr[i] = (int)(Math.random() * 80 + 20);
    }
    public static void PrintArray(Integer[] arr){
        for (Integer integer : arr) System.out.print(integer + "\t");
        System.out.println();
    }
    public static void FillMatrix(Integer[][] arr, int rows, int cols){
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)arr[i][j] = (int)(Math.random() * 80 + 20);
    }
    public static void PrintMatrix(Integer[][] arr){
        for (Integer[] integer : arr) {
            for (Integer i : integer) System.out.print(i + "\t");
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Количество элементов массива: ");
        int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        FillArray(arr);
        PrintArray(arr);
        QuickSort(arr, 0, arr.length-1);
        PrintArray(arr);
        System.out.print("Количество строк мартицы: ");
        n = scan.nextInt();
        System.out.print("Количество колонн матрицы: ");
        int m = scan.nextInt();
        Integer[][] arr2 = new Integer[n][m];
        FillMatrix(arr2, n, m);
        PrintMatrix(arr2);
        QuickSortMatrix(arr2, n, m);
        PrintMatrix(arr2);
    }
}