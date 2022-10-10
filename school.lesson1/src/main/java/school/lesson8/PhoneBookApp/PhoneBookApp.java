package school.lesson8.PhoneBookApp;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook myBook = new PhoneBook();
        myBook.add("Petrenko", "+380111111111");
        myBook.add("Kovalenko", "+380222222222");
        myBook.add("Ivanenko", "+380333333333");
        myBook.add("Ivanenko", "+380444444444");

        System.out.println(myBook.get("Petrenko"));
        System.out.println(myBook.get("Ivanenko"));
        System.out.println(myBook.get("Kozachenko"));
    }
}
