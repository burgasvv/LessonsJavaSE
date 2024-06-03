package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GetNumberRadix {
    public static String getInRadix(int number, int radix){
        List<Character>digits = radixList();
        if (radix < 2 || radix >= digits.size() || number < 0)
            throw new IllegalArgumentException();
        StringBuilder valueOf = new StringBuilder();
        while (number > 0){
            valueOf.insert(0, digits.get(number % radix));
            number /= radix;
        }
        return valueOf.toString();
    }
    public static List<Character>radixList(){
        ArrayList<Character>digits = new ArrayList<>();
        for (char i = '0'; i < '9'; i++)digits.add(i);
        for (char i = 'A'; i < 'Z'; i++)digits.add(i);
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(getInRadix(225, 16));
    }
}