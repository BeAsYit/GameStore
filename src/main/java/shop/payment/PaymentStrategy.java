package shop.payment;

public interface PaymentStrategy {
    boolean pay(double price);
}
