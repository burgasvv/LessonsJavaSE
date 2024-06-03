package Arrays;
import java.util.Scanner;

public class Array_sort_2 {

    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){

            arr[i] = (int)(Math.random() * 50);
            System.out.print(arr[i] + " ");
        }

        for(int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {

                int min = arr[j], index = j;

                if (arr[i] > min) {
                    min = arr[i];
                    index = i;
                }

                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;

            }
        }
        System.out.println();

        for (int i : arr)
            System.out.print(i + " ");
    }
}
