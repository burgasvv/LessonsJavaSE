package Arrays;

import java.util.Scanner;

public class TwoDim_Array_sort {

    public static void main(String[] argc){

       Scanner scan = new Scanner(System.in);

       int  n = scan.nextInt(), m = scan.nextInt();
       int[][] twoArr = new int[n][m];

       for (int i = 0; i < n; i++){
           for (int j = 0; j < m; j++){
               twoArr[i][j] = (int)(Math.random() * 80 + 20);
               System.out.print(twoArr[i][j] + "\t");
           }
           System.out.println();
       }
       System.out.println();

        for (int i = 0; i < twoArr.length; i++){
            for (int j = 0; j < twoArr[i].length; j++){
                for (int k = 0; k < twoArr.length; k++){
                    for (int l = 0; l < twoArr[k].length; l++){
                        if (twoArr[i][j] <= twoArr[k][l]){
                            int temp = twoArr[i][j];
                            twoArr[i][j] = twoArr[k][l];
                            twoArr[k][l] = temp;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print(twoArr[i][j] + "\t");
            System.out.println();
        }
    }
}