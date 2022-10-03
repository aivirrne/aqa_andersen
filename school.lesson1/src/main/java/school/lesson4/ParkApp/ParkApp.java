package school.lesson4.ParkApp;

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
