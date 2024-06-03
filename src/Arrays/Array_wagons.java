package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_wagons {

    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;
        int[] arr = new int[n];

        Arrays.fill(arr, scan.nextInt());

        for (int i = 0; i < n - 1; i++){

            if (arr[i] != arr[i+1] -1){

                count++;
            }
        }
        System.out.println(count);

    }
}