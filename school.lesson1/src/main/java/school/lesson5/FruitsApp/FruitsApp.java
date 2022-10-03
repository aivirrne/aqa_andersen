package school.lesson5.FruitsApp;

public class FruitsApp {
    public static void main(String[] args) {
        Box<Apple> boxApples = new Box<Apple>();
        boxApples.add(new Apple());
        boxApples.add(new Apple());

        Box<Orange> boxOranges = new Box<Orange>();
        boxOranges.add(new Orange());
        boxOranges.add(new Orange());
        boxOranges.add(new Orange());

        System.out.println("Weight of box with apples is " + boxApples.getWeight() + " kg.");
        System.out.println("Weight of box with oranges is " + boxOranges.getWeight() + " kg.");
        System.out.println("Box with apples and box with oranges have the same weight - " + boxApples.compare(boxOranges));

        System.out.println("I will move all apples from first box to new one.");
        Box<Apple> boxApples2 = new Box<Apple>();
        boxApples.moveTo(boxApples2);
        System.out.println("Now weight of the first box with apples is " + boxApples.getWeight() + " kg.");
        System.out.println("And weight of the new box with apples is " + boxApples2.getWeight() + " kg.");
    }
}
