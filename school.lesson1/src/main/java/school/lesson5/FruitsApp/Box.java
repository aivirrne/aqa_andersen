package school.lesson5.FruitsApp;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> items = new ArrayList<T>();

    public float getWeight() {
        float weight = 0;
        for (T item : items) {
            weight += item.weight;
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    public void add(T item) {
        items.add(item);
    }

    public void moveTo(Box<T> box) {
        for (T item : items) {
            box.add(item);
        }
        items.clear();
    }
}
