package Arrays;

import java.util.Scanner;

public class TDArray_Snake {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), m = scan.nextInt();
        int x = scan.nextInt(), y = scan.nextInt();

        int[][] arrSnake = new int[n+1][m+1];
        int count = 0;

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++) arrSnake[i][j] = count++;

        for (int i = 1; i <= n; i++){

            if (i % 2 == 0) {

                boolean sorted = false;

                while (!sorted){

                    sorted = true;

                    for (int j = 1; j <= m-1; j++){

                        if (arrSnake[i][j] < arrSnake[i][j+1]){

                            int temp = arrSnake[i][j];
                            arrSnake[i][j] = arrSnake[i][j+1];
                            arrSnake[i][j+1] = temp;

                            sorted = false;
                        }
                    }
                }
            }
            else {
                int j = 1;
                while (j <= m){
                    j++;
                }
            }
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++) System.out.print(arrSnake[i][j] + "\t");
            System.out.println();
        }
        System.out.println("\nИскомое число: " + arrSnake[x][y]);
    }
}