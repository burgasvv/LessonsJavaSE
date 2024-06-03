package Arrays;

import java.util.Scanner;


public class HomeWorkSum {

    public  static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        int sum = 0, max = -100, min = 100;

        for (int i = 0; i < n; i++){

            arr[i] = scan.nextInt();

            if (arr[i] > 0){

                sum += arr[i];
            }

            if (arr[i] < min){


                min = arr[i];
            }
            if (arr[i] < max){


                max = arr[i];
            }

        }


        int multi = 1;


        for (int i = 1; i < n-1; i++){

            multi *= arr[i];

        }


        System.out.println(sum + " " + multi);

    }
}