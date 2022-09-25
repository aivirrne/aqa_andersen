package school.lesson4;

abstract class Animal {
    private static int count;
    String name;
    int runDistance;
    int swimDistance;


    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        count++;
    }

    public abstract void run(int runDistance);

    public abstract void swim(int swimDistance);

    public static int getCount() {
        return count;
    }
}

class Cat extends Animal {
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

class Dog extends Animal {
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

class Plate {
    private int food;

    public void addFood(int food) {
        if (food >= 0) {
            this.food += food;
        }
    }

    public boolean eat(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false;
    }
}

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat("Пушок");
        cat.run(300);
        cat.swim(20);
        Animal dog1 = new Dog("Бобик");
        dog1.run(300);
        dog1.swim(20);
        Animal dog2 = new Dog("Тузик");
        dog2.run(700);
        dog2.swim(8);
        System.out.println("Создано " + Animal.getCount() + " животных, из них котов - " + Cat.getCount() + ", собак - " + Dog.getCount() + ".");

        Plate plate = new Plate();
        plate.addFood(60);

        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat " + i);
            cats[i].eat(plate);

            if (cats[i].getSatiety()) {
                System.out.println(cats[i].name + " сытый");
            } else {
                System.out.println(cats[i].name + " голодный");
            }
        }
    }
}


