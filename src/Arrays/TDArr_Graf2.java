package Arrays;

import java.util.Scanner;

public class TDArr_Graf2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] graf = new int[n][n];
        int[] colour = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++){

            for (int j = 0; j <n; j++){

                graf[i][j] = scan.nextInt();
            }

        }

        for (int i = 0; i < n; i++){

            colour[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                if (graf[i][j] == 1 && colour[i] != colour[j])
                    sum++;

            }

        }
        System.out.println(sum/2);

    }
}
