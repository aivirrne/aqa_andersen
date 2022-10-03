package school.lesson4.AnimalApp;


public class Plate {
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
