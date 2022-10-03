package school.lesson4.AnimalApp;


public class Cat extends Animal {
    private static int count;
    private boolean satiety;

    public Cat(String name) {
        super(name, 200, 0);
        count++;
        satiety = false;
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Расстояние должно быть больше 0.");
        } else if (distance <= runDistance) {
            System.out.println("Кот " + name + " пробежал " + distance + " м.");
        } else {
            System.out.println("Кот " + name + " не может пробежать больше " + runDistance + " м.");
        }
    }

    public void swim(int distance) {
        System.out.println("Кот " + name + " не плавает.");
    }

    public void eat(Plate plate) {
        if (!satiety) {
            satiety = plate.eat(15);
        }
    }

    public static int getCount() {
        return count;
    }

    public boolean getSatiety() {
        return satiety;
    }
}

