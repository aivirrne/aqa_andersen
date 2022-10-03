package school.lesson4.AnimalApp;

public abstract class Animal {
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
