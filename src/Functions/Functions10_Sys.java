package Functions;

import java.util.Scanner;

public class Functions10_Sys {

    static int Sys(int n, int k, int[] arr){

        int i = 0;
        while (n != 0){

            arr[i++] = n % k;
            n /= k;
        }
        return i;
    }
    static int SysDiff(int[] arr, int len){

        int d = 0, s1 = 1, s2 = 0;

        for (int i = 0; i < len; i++) {
            s1 *= arr[i];
            s2 += arr[i];
        }
        d = s1 - s2;

        return d;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[200];

        int n = scan.nextInt(), k = scan.nextInt();
        int len = Sys(n, k, arr);

        for (int i = 0; i < len; i++) System.out.print(arr[i]);

        System.out.println("\n" + SysDiff(arr, len));
    }
}