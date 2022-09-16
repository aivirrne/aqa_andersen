package school.lesson2;

public class Task4 {
    public static void main(String[] args) {
        printWordNTimes("word", 3);
    }

    public static void printWordNTimes(String word, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}
