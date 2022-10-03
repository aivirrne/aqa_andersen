package school.lesson4.AnimalApp;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name, 500, 10);
        count++;
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Расстояние должно быть больше 0.");
        } else if (distance <= runDistance) {
            System.out.println("Пес " + name + " пробежал " + distance + " м.");
        } else {
            System.out.println("Пес " + name + " не может пробежать больше " + runDistance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("Расстояние должно быть больше 0");
        } else if (distance <= swimDistance) {
            System.out.println("Пес " + name + " проплыл " + distance + " м.");
        } else {
            System.out.println("Пес " + name + " не может проплыть больше " + swimDistance + " м.");
        }
    }

    public static int getCount() {
        return count;
    }
}

