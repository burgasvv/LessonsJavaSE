package Strings;

import java.util.Scanner;

public class Strings3_LicenseNum {
    static boolean isLetter(char c){

        String str = "ABCEHKMOPTXY";
        return str.contains(String.valueOf(c));
    }
    static boolean isNumber(char c){

        return c < '9' && c > '0';
    }
    static boolean isLicenseNumb(String str){

        return isLetter(str.charAt(0))
                && isNumber(str.charAt(1))
                && isNumber(str.charAt(2))
                && isNumber(str.charAt(3))
                && isLetter(str.charAt(0))
                && isLetter(str.charAt(0));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++){

            String test = scan.next();
            System.out.println(isLicenseNumb(test) ? "Yes" : "No");
        }
    }
}