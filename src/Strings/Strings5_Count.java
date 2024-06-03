package Strings;

import java.util.Scanner;

public class Strings5_Count {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = str.split("f", -1).length-1;
        System.out.println(n);
        String cruel = "f";
        int m = (str.length() - str.replace(cruel, "").length()) / cruel.length();
        System.out.println(m);
        str = str.replace("f", "jjjjjjj");
        System.out.println(str);
    }
}