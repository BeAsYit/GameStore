package shop.payment;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.format("You choose to pay %f with cash\n",price);
        return true;
    }
}
