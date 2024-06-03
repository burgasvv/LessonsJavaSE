package Strings;

import java.util.Scanner;

public class Strings1 {

    static boolean PalOrNot(String str){

        str = str.toLowerCase();
        str = str.replace(" ", "");
        int len = str.length();

        for (int i = 0; i < len/2; i++)
            if (str.charAt(i) != str.charAt(len-i-1))
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "Hello world.";

//        System.out.println(str.charAt(4)); // Возвращает символ из строки;
//        System.out.println(str.length()); // Возвращает длину строки;
//        System.out.println(str.indexOf("or")); // Возвращает число знаков до первого искомого словосочетания;

//        if (str.equals("Hello world"))   // Сравнение строк;
//        if (str.compareTo("Hello world") == 0) // Сравение строки 2;
//        if (str.contains("world")); //

//        String str2 = str.substring(3, 7); // Возвращает строку в диапазоне;
//        String str3 = "1 2 3 4 5 6 7 8 9";
//        String[] str4 = str3.split(" "); // Разделяет строку на массив;
//        System.out.println(str4[3]);

//        str = str.toUpperCase();  // Все буквы большие;
//        System.out.println(str);
//        str = str.toLowerCase();  // Все буквы маленькие;
//        System.out.println(str);
//
//        str = str.replace('l', 'g');  // Замена букв;
//        System.out.println(str);

//        str = scan.nextLine();
//        str = str.toUpperCase();
//        System.out.println(str);;

        str = scan.nextLine();
        System.out.println(PalOrNot(str)?"Да":"Нет"); // Тернарные операторы;
    }
}