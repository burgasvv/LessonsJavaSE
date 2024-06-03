package Arrays;
import java.util.Scanner;

public class TDArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), m = scan.nextInt();

        int[][] tdArr = new int[n][m]; // сначала номер строки, затем номер столбца;
        int[] max = new int[n];  // максимум всех строк;
        int[] min = new int[m];  // минимум всех столбцов;

        for (int i = 0; i < n; i++){ // колличество строк;

            for (int j = 0; j < m; j++){ // колличество столбцов;

                tdArr[i][j] = (int)(Math.random() * 40 + 10);

                System.out.print(tdArr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){ // колличество строк;

            for (int j = 0; j < m; j++){ // колличество столбцов;

                max[i] = 0;
                min[j] = 50;

                if (tdArr[i][j] > max[i]){

                    max[i] = tdArr[j][i];
                }

                if (tdArr[i][j] < min[j]){

                    min[j] = tdArr[j][i];
                }
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++){ // колличество строк;

            System.out.print(max[i] + "\t");
        }
        System.out.println();

        for (int j = 0; j < m; j++){ // колличество столбцов;

            System.out.print(min[j] + "\t");
        }
    }
}