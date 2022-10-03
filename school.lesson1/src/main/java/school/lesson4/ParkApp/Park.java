package school.lesson4.ParkApp;


public class Park {
    static class Attraction {
        String name;
        String openTime;
        String closeTime;
        int price;

        public Attraction(String name, String openTime, String closeTime, int price) {
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }

        public String toString() {
            return "Attraction " + name + " works from " + openTime + " to " + closeTime + ", one ride costs: " + price + " zł.";
        }
    }

    Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public void showAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }
}
