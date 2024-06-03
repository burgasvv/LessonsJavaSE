package ArrayList;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayList2_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] arr = new Integer[15];
        for (int i = 0; i < arr.length; i++)Array.set(arr,i,new Random().nextInt(10,100));
        System.out.println("Массив: " + Arrays.toString(arr));

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Лист: " + arrayList);
//        Collections.sort(arrayList);
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Лист: " + arrayList);

        Arrays.sort(arr);
        System.out.println("Массив: " + Arrays.toString(arr));
    }
}