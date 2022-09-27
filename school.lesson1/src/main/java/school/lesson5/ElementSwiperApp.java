package school.lesson5;
import java.util.Arrays;

public class ElementSwiperApp {

    static public <T> void swipeElements(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        String[] arrAnimals = {"Cat", "Dog", "Hamster", "Lizard"};
        System.out.println("Array before the swipe is: " + Arrays.toString(arrAnimals));
        swipeElements(arrAnimals, 1, 3);
        System.out.println("Array after the swipe is: " + Arrays.toString(arrAnimals));

        Integer[] arrNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array before the swipe is: " + Arrays.toString(arrNumbers));
        swipeElements(arrNumbers, 2, 7);
        System.out.println("Array after the swipe is: " + Arrays.toString(arrNumbers));
    }

}
