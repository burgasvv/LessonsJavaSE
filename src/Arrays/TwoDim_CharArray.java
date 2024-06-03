package Arrays;

import java.util.Scanner;

public class TwoDim_CharArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        char[][] arr1 = new char[n][m];
        char[][] arr2 = new char[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {

                while (arr1[i][j] != 'B' && arr1[i][j] != 'W')
                    arr1[i][j] = (char) (Math.random() * 25 + 65);
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {

                while (arr2[i][j] != 'B' && arr2[i][j] != 'W')
                    arr2[i][j] = (char) (Math.random() * 25 + 65);
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){

                if (arr1[i][j] != arr2[i][j]) {
                    arr1[i][j] = '_';
                    arr2[i][j] = '|';
                }
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print(arr1[i][j] + "\t");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print(arr2[i][j] + "\t");
            System.out.println();
        }

    }
}