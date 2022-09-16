package school.lesson2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 11));
    }
    public static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}
