package school.lesson2;

public class Task6 {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int[] arr = new int[100];
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            System.out.println("arr[" + i + "] = " + arr[i]);
            counter++;
        }
    }

}
