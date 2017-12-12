package shop.users;

public class Customer extends User {

    public Customer(String name, int age){
        super(name,age);
    }


    @Override
    public void update() {
        System.out.println("Customer got update!");
    }
}
