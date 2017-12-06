package shop.payment;


import org.junit.Assert;
import org.junit.Test;
import shop.Cart;
import shop.decorators.BonusDecorator;
import shop.delivery.DeliveryNovaPoshta;

public class TestCashPayment{
    private Cart testCart = new BonusDecorator(new Cart());


    @Test
    public void testPay() throws Exception{
        testCart.setPaymentStrategy(new CashPayment());
        testCart.setDeliveryStrategy(new DeliveryNovaPoshta());
        Assert.assertTrue(testCart.ship());
    }
}
