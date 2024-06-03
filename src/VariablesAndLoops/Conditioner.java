package VariablesAndLoops;

import java.util.Scanner;

public class Conditioner {

    public static void main(String[] argc){

        Scanner scan = new Scanner(System.in);

        double t_room = (int)(Math.random() * 80 - 40);
        char choose = 'y';

        while (choose == 'y'){
            System.out.println("\nRoom temperature: " + t_room + "C.");
            System.out.println("Enter desired temperature: ");
            int t_cond = scan.nextInt();
            String command = "";

            if (t_cond <= -40 || t_cond >= 40){
                while (t_cond <= -40 || t_cond >= 40) {
                    System.out.println("Wrong temperature.");
                    System.out.println("Enter desired temperature: ");
                    t_cond = scan.nextInt();
                }
            }
            if (t_room < t_cond){
                while(t_room <= t_cond){
                    System.out.print(t_room + "C ");
                    t_room ++;
                }
                command = "Heating";
                System.out.println("\n" + command);
            } else if (t_room > t_cond) {
                while (t_room >= t_cond){
                    System.out.print(t_room + "C ");
                    t_room--;
                }
                command = "Freezing";
                System.out.println("\n" + command);
            } else if (t_room == t_cond) {
                System.out.println(t_room);
                command = "Fan";
                System.out.println("\n" + command);
            }
            double t = (int)t_room;
            System.out.println("Do you want to change the temperature? y/any key.");
            choose = scan.next().charAt(0);
        }
    }
}