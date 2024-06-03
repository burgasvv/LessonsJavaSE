package Strings;

import java.util.Scanner;
public class Strings2_NapNap {
    public static void Nap(String str){
        int[] abc = {1,0,0};
        int temp = 0;
        for (int i = 0; i < abc.length; i++){

            switch (str.charAt(i)) {
                case 'A' -> {
                    temp = abc[0];
                    abc[0] = abc[1];
                    abc[1] = temp;
                }
                case 'B' -> {
                    temp = abc[2];
                    abc[2] = abc[1];
                    abc[1] = temp;
                }
                case 'C' -> {
                    temp = abc[0];
                    abc[0] = abc[2];
                    abc[2] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++)
            if (abc[i] == 1)
                System.out.println(abc[i] = i+1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        Nap(str);
    }
}