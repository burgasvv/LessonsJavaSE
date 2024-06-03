package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int n = (int)(Math.random()*40+10);
            numbers.add(n);
        }
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}