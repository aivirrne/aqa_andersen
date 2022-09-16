package school.lesson2;

public class Task2 {
    public static void main(String[] args) {
        isPositiveOrNegative(-20);

    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("This number is positive");
        } else {
            System.out.println("This number is negative");
        }
    }
}
