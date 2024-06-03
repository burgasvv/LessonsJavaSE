package Strings;

import java.util.Scanner;

public class Strings6_Quantity {
    static void SymbolsQuan(String str){
        String s = "";
        int n;
        while (!s.equals("quit")){
            Scanner scan = new Scanner(System.in);
            System.out.print("Input symbоls: ");
            s = scan.nextLine();
            if (str.contains(s)){
                n = str.split(s, -1).length-1;
                System.out.println("Quantity: " + n);
            } else if (s.equals("quantity")) {
                System.out.println("Quantity: " + str.length());
            } else if (s.equals("quit"))
                return;
            else System.out.println("No such symbols.");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        SymbolsQuan(str);
    }
}