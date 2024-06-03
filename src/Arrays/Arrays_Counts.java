package Arrays;

import java.util.Scanner;

public class Arrays_Counts {

    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count1 = 0, count2 = 0;
        int sum1 = 0, sum2 = 0;

        int[] arr = new int[n];

        if (n <= 0){
            System.out.println("Error!");
        }

        for (int i = 0; i < n; i++){

            arr[i] = (int)(Math.random() * 50);
            System.out.print(arr[i] + " ");

            if (arr[i] % 2 == 0){

                sum1 += arr[i];
                count1++;
            }
            else {

                sum2 += arr[i];
                count2++;
            }
        }
        System.out.println("\nEven: " + count1 + "\nOdd: " + count2);
        System.out.println("Sum even: " + sum1 + "\nSum odd: " + sum2);

        int[] evenArr = new int[count1];
        int[] oddArr = new int[count2];
        int I = 0, II = 0;

        for (int i = 0; i < n; i++){

            if (arr[i] % 2 == 0)
                evenArr[I++] = arr[i];

            else
                oddArr[II++] = arr[i];

        }
        for (int j : evenArr) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int j : oddArr) System.out.print(j + " ");

    }
}