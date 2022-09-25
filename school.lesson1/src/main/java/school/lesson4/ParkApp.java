package school.lesson4;

class Park {
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

public class ParkApp {
    public static void main(String[] args) {
        Park park = new Park(new Park.Attraction[]{
                new Park.Attraction("Ferris wheel", "9:00", "21:00", 10),
                new Park.Attraction("Freefall", "12:00", "18:00", 15),
                new Park.Attraction("Helter skelter", "9:00", "15:00", 5),
                new Park.Attraction("Paratrooper", "10:00", "19:00", 12),
                new Park.Attraction("Roller coaster", "13:00", "20:00", 18),
        });
        park.showAttractions();
    }
}
