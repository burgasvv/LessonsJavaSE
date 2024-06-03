package Arrays;

import java.util.Scanner;

public class Array_BubbleSort {
    public static void BubbleSortArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }
    public static void FillArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++) arr[i] = (int)(Math.random() * 80 + 20);
    }
    public static void PrintArray(Integer[] arr){
        for (Integer integer : arr) System.out.print(integer + "\t");
        System.out.println();
    }
    public static void BubbleSortMatrix(Integer[][] sortArr){
        for (int i = 0; i < sortArr.length; i++){
            for (int j = 0; j < sortArr[i].length; j++){
                for (int k = 0; k < sortArr.length; k++){
                    for (int l = 0; l < sortArr[k].length; l++){
                        if (sortArr[i][j] <= sortArr[k][l]){
                            int temp = sortArr[i][j];
                            sortArr[i][j] = sortArr[k][l];
                            sortArr[k][l] = temp;
                        }
                    }
                }
            }
        }
    }
    public static void FillMatrix(Integer[][] arr, int rows, int cols){
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)arr[i][j] = (int)(Math.random() * 80 + 20);
    }
    public static void PrintMatrix(Integer[][] arr){
        for (Integer[] integer : arr){
            for (Integer i : integer)System.out.print(i + "\t");
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
        BubbleSortArray(arr);
        PrintArray(arr);
        System.out.print("Количество строк матрицы: ");
        n = scan.nextInt();
        System.out.print("Количество колонн матрицы: ");
        int m = scan.nextInt();
        Integer[][] arr2 = new Integer[n][m];
        FillMatrix(arr2, n, m);
        PrintMatrix(arr2);
        BubbleSortMatrix(arr2);
        PrintMatrix(arr2);
    }
}