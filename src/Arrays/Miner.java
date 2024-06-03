package Arrays;

import java.util.Scanner;

public class Miner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = 10, mines = 10;
        int[][] area = new int[n][n];

        while(mines > 0){

            int x = (int)(Math.random() * n);
            int y = (int)(Math.random() * n);

            if (area[y][x] < 10){

                area[y][x] = 99;

                if (y > 0) {

                    if(x > 0) area[y - 1][x - 1]++;
                    if (x < n -1) area[y - 1][x + 1]++;
                    area[y - 1][x]++;

                }

                if (y < n - 1 && x > 0) area[y+1][x-1]++;
                if (y < n - 1 && x < n - 1) area[y+1][x+1]++;
                if (y < n - 1) area[y+1][x]++;

                if (x > 0) area[y][x-1]++;
                if (x < n - 1)area[y][x+1]++;

            }

            mines--;

        }

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                if (area[i][j] > 9)
                    System.out.print("* ");
                else if (area[i][j] == 0)
                    System.out.print("  ");
                else
                    System.out.print(area[i][j] + " ");
            }

            System.out.println();
        }

    }
}