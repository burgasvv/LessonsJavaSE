package Functions;

import java.util.Scanner;

public class Functions11 {

    static boolean Synt(char c){
        return c == ',' || c == '.' || c == '!' || c == '?' || c == '-';
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        System.out.println(Synt(c));
    }
}
