package shop.delivery;

import org.junit.Assert;
import org.junit.Test;
import shop.Cart;
import shop.decorators.BonusDecorator;
import shop.payment.CashPayment;

public class TestDeliveryDHL{

    private Cart testCart = new BonusDecorator(new Cart());


    @Test
    public void testDeliver() throws Exception{
        testCart.setDeliveryStrategy(new DeliveryDHL());
        testCart.setPaymentStrategy(new CashPayment());
        Assert.assertTrue(testCart.ship());
    }
}
