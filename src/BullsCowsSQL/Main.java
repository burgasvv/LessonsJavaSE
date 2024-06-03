package BullsCowsSQL;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Users(ArrayList<User>users){
        for (User user : users)user.getUser();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        UserContext context = new UserContext();

        System.out.println("What's your name?");
        user.setName(scanner.nextLine());

        BullsCows bullsCows = new BullsCows();

        int[]numbers = new int[4];
        int[]result;

        while (!bullsCows.isWinner()) {
            user.setScore(user.getScore()+1);
            for (int i = 0; i < 4; i++) numbers[i] = scanner.nextInt();
            result = bullsCows.check(numbers);
            System.out.println(result[0] + " " + result[1]);
        }
        System.out.println("You won!");
        context.insert(user);
    }
}