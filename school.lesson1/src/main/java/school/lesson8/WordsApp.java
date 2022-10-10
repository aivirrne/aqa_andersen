package school.lesson8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class WordsApp {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("table");
        words.add("window");
        words.add("spider");
        words.add("water");
        words.add("plate");
        words.add("blanket");
        words.add("chair");
        words.add("spider");
        words.add("fridge");
        words.add("plate");
        words.add("cat");
        words.add("dog");

        System.out.println("Initial words:" + words);

        HashSet<String> wordsSet = new HashSet<>(words);

        System.out.println("Unique words" + wordsSet);
        for (String key : wordsSet) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
