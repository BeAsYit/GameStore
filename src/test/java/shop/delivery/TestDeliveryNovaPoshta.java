package shop.delivery;

import org.junit.Assert;
import org.junit.Test;
import shop.Cart;
import shop.decorators.BonusDecorator;
import shop.payment.CashPayment;

public class TestDeliveryNovaPoshta{

    private Cart testCart = new BonusDecorator(new Cart());


    @Test
    public void testDeliver() throws Exception{
        testCart.setDeliveryStrategy(new DeliveryNovaPoshta());
        testCart.setPaymentStrategy(new CashPayment());
        Assert.assertTrue(testCart.ship());
    }
}
