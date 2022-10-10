package school.lesson8.PhoneBookApp;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    public PhoneBook() {}

    public void add(String lastName, String phone) {
        contacts.add(new Contact(lastName, phone));
    }

    public ArrayList<Contact> get(String lastName) {
        final ArrayList<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (lastName.equals(contact.lastName)) {
                result.add(contact);
            }
        }
        return result;
    }

    static class Contact {
        final String lastName;
        final String phone;

        public Contact(String lastName, String phone) {
            this.lastName = lastName;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "lastName='" + lastName + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }


}
