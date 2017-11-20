import junit.framework.TestCase;
import org.junit.Assert;


public class TestInventory extends TestCase {

    public void testAddGame(){
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.games.size() == 1);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.games.size() == 2);

    }

    public void testGetGame(){
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.getGame(4) != null);
        Assert.assertTrue(inventory.getGame(5) == null);
    }

    public void testSearch(){
        Inventory inventory = new Inventory();
        inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        inventory.addGame(50, "Just Nerds",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        GameProperties searchGame = new GameProperties(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertFalse(inventory.search(searchGame).isEmpty());
        searchGame = new GameProperties(50, "Just Something", 2009, Genre.SHOOTER, Engine.UNREALENGINE);
        Assert.assertTrue(inventory.search(searchGame).isEmpty());

    }
}
