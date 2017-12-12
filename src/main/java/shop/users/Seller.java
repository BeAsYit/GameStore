package shop.users;

public class Seller extends User {

    public Seller(String name, int age){
        super(name, age);
    }

    @Override
    public void update() {
        System.out.println("Seller got update!");
    }
}
