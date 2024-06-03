package Arrays;

import java.util.Scanner;

public class Crosses_and_Zeroes {

    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        int n = 9, count = 0;
        boolean isCross = true, winner = false;

        char[]arr = new char[n];

        for (int i = 0; i < n; i++)
            arr[i] = '_';

        while (!winner && count < 9){

            int turn = 0;

            if (isCross) {
                System.out.println("Ход крестиков: ");
                turn = scan.nextInt();
            }
            else {
                System.out.println("Ход ноликов: ");
                turn = (int) (Math.random() * 8);

                if (arr[turn] != '_')
                    turn = (int) (Math.random() * 8);
            }


            if (turn >= 0 && turn < 9 && arr[turn] == '_' ) {

                count++;

                if (isCross)
                    arr[turn] = 'X';
                else
                    arr[turn] = 'O';

                for (int i = 0; i < n; i++) {

                    if (i % 3 == 0)
                        System.out.println();

                    System.out.print(arr[i] + " ");
                }
                System.out.println();

                if (arr[0] == arr[1] && arr[1] == arr[2] && arr[0] != '_')
                    winner = true;
                if (arr[3] == arr[4] && arr[4] == arr[5] && arr[3] != '_')
                    winner = true;
                if (arr[6] == arr[7] && arr[7] == arr[8] && arr[6] != '_')
                    winner = true;

                if (arr[0] == arr[3] && arr[3] == arr[6] && arr[0] != '_')
                    winner = true;
                if (arr[1] == arr[4] && arr[4] == arr[7] && arr[1] != '_')
                    winner = true;
                if (arr[2] == arr[5] && arr[5] == arr[8] && arr[2] != '_')
                    winner = true;

                if (arr[0] == arr[4] && arr[4] == arr[8] && arr[0] != '_')
                    winner = true;
                if (arr[2] == arr[4] && arr[4] == arr[6] && arr[2] != '_')
                    winner = true;

                isCross = !isCross;

            }
            else
                System.out.println("Такой ход не корректен.");
        }

        if (count == 9 && !winner){
            System.out.println("Ничья.");
        }
        else if (isCross){
            System.out.println("Победили нолики.");
        }
        else
            System.out.println("Победили крестики.");
    }

}