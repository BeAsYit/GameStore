package shop;

        import shop.decorators.BonusDecorator;
        import shop.decorators.CartDecorator;
        import shop.decorators.DiscountDecorator;
        import shop.delivery.DeliveryNovaPoshta;
        import shop.game.*;
        import shop.payment.Privat24Payment;
        import shop.users.Customer;
        import shop.users.Seller;


public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GameProperties whatErikLikes = new GameProperties(50, "JUst Cause", 2009, Genre.SHOOTER, Engine.UNREALENGINE);
        GameProperties whatErikLikes1 = new GameProperties(510, "JUst Caused", 2009, Genre.SHOOTER, Engine.UNREALENGINE);

        Cart cart = new Cart();
        cart.addToCart(new ComputerGame(whatErikLikes));
        cart.addToCart(new ComputerGame(whatErikLikes1));
        cart.setDeliveryStrategy(new DeliveryNovaPoshta());
        System.out.println(cart.computeTotalPrice());
        cart.setPaymentStrategy(new Privat24Payment());
        Cart cartDecorator = new DiscountDecorator(new BonusDecorator(new CartDecorator(cart)), 20);
        cartDecorator.ship();

        Observable observable = new Observable();
        Customer Dan = new Customer("Dan", 225);
        observable.addObserver(Dan);
        observable.removeObserver(Dan);
        Seller Bob = new Seller("Dan", 227);
        observable.addObserver(Bob);
        observable.notifyObservers();
    }

    private static void initializeInventory(Inventory inventory) {
    }

}


