package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Array_SelectionSort {
    public static void SelectionSort(Integer[]arr){
        for (int i = 0; i < arr.length; i++){
            int pos = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < min){
                    pos = j;
                    min = arr[j];
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }
    public static void FillArray(Integer[]arr){
        for (int i = 0; i < arr.length; i++)
            Array.set(arr, i, new Random().nextInt(10, 100));
    }
    public static void PrintArray(Integer[]arr){
        String string = Arrays.toString(arr);
        System.out.println(string);
    }
    public static void main(String[] args) {
        System.out.println();
        Integer[]arr = new Integer[15];
        FillArray(arr);
        PrintArray(arr);
        SelectionSort(arr);
        PrintArray(arr);
    }
}