package school.lesson4.PaymentApp;

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
