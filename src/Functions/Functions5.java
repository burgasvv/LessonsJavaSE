package Functions;

import java.util.Scanner;

public class Functions5 {

    static void MirrorArr(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) System.out.print(arr[i] + "\t");
    }

    static void StraightAng(int n, int m, char c){

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {

                if (i==0 || j==0 ||i==n-1 || j==m-1)
                    System.out.print(c + "\t");
                else
                    System.out.print(" " + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){

            arr[i] = count++;
            System.out.print(arr[i] + "\t");
        }

        System.out.print("|\t");
        MirrorArr(arr);
        System.out.println("\n");

        n = scan.nextInt(); int m = scan.nextInt();
        char c = scan.next().charAt(0);

        StraightAng(n, m, c);
    }
}