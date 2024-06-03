package Arrays;

import java.util.Objects;
import java.util.Scanner;

public class Array_sort {

    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 50);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < n-1; j++){
                if (arr[j] > arr[j+1]){
                    int buffer = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buffer;
                }
                if (Objects.equals(arr[j], arr[j + 1]))
                    arr[j+1] += 1;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");

        int suMin = 0, suMax = 0;

        for (int i = 0; i < n/2; i++){
            suMin += arr[i];
            suMax += arr[i + n/2];
        }
        System.out.println("\n" + (suMax - suMin));
    }
}