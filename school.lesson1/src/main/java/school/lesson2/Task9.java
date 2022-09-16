package school.lesson2;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeArray(6, 2)));
    }

    public static int[] makeArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}
