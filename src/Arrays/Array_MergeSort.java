package Arrays;



import java.lang.reflect.Array;
import java.util.*;

public class Array_MergeSort {
    private static Integer[] MergeSortInner(Integer[]buffer1, Integer[]buffer2, int start, int end){
        if (start >= end-1)return buffer1;
        int middle = start + (end - start) / 2;
        Integer[]sorted1 = MergeSortInner(buffer1, buffer2, start, middle);
        Integer[]sorted2 = MergeSortInner(buffer1, buffer2, middle, end);
        Integer[]result = sorted1 == buffer1 ? buffer2 : buffer1;
        int i1 = start, i2 = middle, j = start;
        while (i1 < middle && i2 < end) result[j++] = sorted1[i1] < sorted2[i2] ? sorted1[i1++] : sorted2[i2++];
        while (i1 < middle)result[j++] = sorted1[i1++];
        while (i2 < end)result[j++] = sorted2[i2++];
        return result;
    }
    public static Integer[] MergeSort(Integer[]arr){
        Integer[]buffer1 = Arrays.copyOf(arr, arr.length);
        Integer[]buffer2 = new Integer[arr.length];
        return MergeSortInner(buffer1, buffer2, 0, arr.length);
    }

    public static void main(String[] args) {
        System.out.println();
        Integer[]arr = new Integer[15];
        for (int i = 0; i < arr.length; i++) Array.set(arr, i, new Random().nextInt(10, 100));
        System.out.println(Arrays.toString(arr));
        arr = MergeSort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer>integerList = new ArrayList<>(List.of(arr));
        System.out.println(integerList);
        integerList.remove(integerList.size()-1);
        System.out.println(integerList);
        arr = integerList.toArray(new Integer[integerList.size()]);
        System.out.println(Arrays.toString(arr));
    }
}