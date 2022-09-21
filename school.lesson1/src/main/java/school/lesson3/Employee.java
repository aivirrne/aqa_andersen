package school.lesson3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Zinaida Mishchenko", "Auto QA", "zinamishch@gmail.com", "+48000000000", 6500, 27);
        emplArray[1] = new Employee("Petro Petrenko", "Developer", "petro@gmail.com", "+48111111111", 4000, 53);
        emplArray[2] = new Employee("Mykola Mykolayenko", "Manual QA", "mykola@gmail.com", "+48222222222", 4500, 45);
        emplArray[3] = new Employee("Kateryna Katerynenko", "Business Analyst", "kateryna@gmail.com", "+48333333333", 5200, 31);
        emplArray[4] = new Employee("Olena Olenenko", "Project Manager", "olena@gmail.com", "+48444444444", 5000, 49);
        for (Employee i : emplArray) {
            if (i.age >= 40) {
                i.getInfo();
            }
        }
    }

    public void getInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "Name: " + this.name + ", position: " + this.position + ", email: " + this.email + ", phone: " + this.phone + ", salary: " + this.salary + ", age: " + this.age;
    }

}
