package school.lesson4.AnimalApp;


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
