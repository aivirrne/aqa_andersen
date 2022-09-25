package school.lesson4;

class Payment {
    static class Product {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return "Product: " + name + ", price: " + price + " zł.";
        }
    }

    Product[] products;
    int size;
    int count;

    public Payment(int size) {
        this.size = size;
        products = new Product[size];
    }

    public void addProduct(Product product) {
        if (count < size) {
            products[count] = product;
            count++;
        } else {
            System.out.println("You can't add more products.");
        }
    }

    public void showProducts() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i]);
        }
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment = new Payment(3);
        payment.addProduct(new Payment.Product("Chocolate", 12));
        payment.addProduct(new Payment.Product("Cookies", 16));
        payment.addProduct(new Payment.Product("Milk", 9));
        payment.addProduct(new Payment.Product("Ice Cream", 10));
        payment.showProducts();
    }
}
