import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);


        ComputerGame whatErikLikes = new ComputerGame(0, "JUst Cause", 2009, Genre.SHOOTER, Engine.UNREALENGINE);
        List matchingGames = inventory.search(whatErikLikes);


        if (!matchingGames.isEmpty()){
            System.out.println("Matching games:");
            for (Object matchingGame : matchingGames) {
                ComputerGame game = (ComputerGame) matchingGame;
                System.out.println("We have a " + game.getName() +", it's engine: "+ game.getEngine() +", genre: "+ game.getGenre() +
                        " and price: " + game.getPrice());
            }
        }else{
            System.out.println("Nothing, sorry");
        }
    }
        private static void initializeInventory (Inventory inventory){
            inventory.addGame(50, "Just Cause",2009, Genre.SHOOTER, Engine.UNREALENGINE);
            inventory.addGame(50, "Just Nerds",2069, Genre.SHOOTER, Engine.UNREALENGINE);
        }

}


