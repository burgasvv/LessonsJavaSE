package Arrays;

import java.util.Scanner;
public class Ali_Baba_Array {

    public  static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), m = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){

            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++){

            for (int j = 0; j < n-1; j++){

                if (arr[j] < arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++){

            sum += arr[i];
        }

        System.out.println(sum);
    }
}