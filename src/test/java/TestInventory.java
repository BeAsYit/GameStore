import junit.framework.TestCase;
import org.junit.Assert;


public class TestInventory extends TestCase {

    public void testaddGame(){
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.games.size() == 1);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.games.size() == 2);

    }

    public void testgetGame(){
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        System.out.println(inventory.getGame(2));
        System.out.println(inventory.getGame(3));
        for (ComputerGame ggg:inventory.games) {
            System.out.println(ggg.getSerialNumber());
        }
        Assert.assertTrue(inventory.getGame(2) != null);
        Assert.assertTrue(inventory.getGame(3) == null);
    }

    public void testsearch(){
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        ComputerGame searchGame = new ComputerGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertFalse(inventory.search(searchGame).isEmpty());
        searchGame = new ComputerGame(50, "Just Something", 2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.search(searchGame).isEmpty());

    }
}
