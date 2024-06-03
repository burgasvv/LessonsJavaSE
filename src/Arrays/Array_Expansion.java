package Arrays;

import java.util.Scanner;

public class Array_Expansion {
    public static void Expansion(Integer[] arr, int n){
        Integer[] temp = new Integer[arr.length + n];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        for (int i = arr.length; i != temp.length; i++) temp[i] = (int)(Math.random() * 50 + 100);
        arr = temp;
        for (Integer integer : arr) System.out.print(integer + "\t");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 80 + 20);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        Expansion(arr, 5);
    }
}