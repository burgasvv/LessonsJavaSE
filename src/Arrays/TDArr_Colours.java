package Arrays;

import java.util.Scanner;

public class TDArr_Colours {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), m = scan.nextInt();
        char[][] colour1 = new char[n][m];
        char[][] colour2 = new char[n][m];

        int sum = 0;

        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){

                while (colour1[i][j] != 'B' && colour1[i][j] != 'W'){

                    colour1[i][j] = (char)(Math.random() * 65 + 25);
                }
            }
        }

        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){

                while (colour2[i][j] != 'B' && colour2[i][j] != 'W'){

                    colour2[i][j] = (char)(Math.random() * 65 + 25);
                }
            }
        }

        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){

                System.out.print(colour1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){

                System.out.print(colour2[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){

                if (colour1[i][j] == colour2[i][j])
                    sum++;

            }
        }

        System.out.println("\nСумма совпадений: " + sum);

    }
}