package shop.game;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    public List<ComputerGame> games;


    public Inventory(){
        games = new LinkedList<ComputerGame>();
    }

    public void addGame(double price, String name,int year, Genre genre, Engine engine){
        GameProperties props = new GameProperties(price, name, year, genre, engine);
        ComputerGame game = new ComputerGame(props);
        games.add(game);
    }


    public ComputerGame getGame(int serialNumber){
        for (Object game1 : games) {
            ComputerGame game = (ComputerGame) game1;
            if (game.getSerialNumber()== serialNumber) {
                return game;
            }
        }
        return null;
    }

    public List search(GameProperties searchGame){
        List<ComputerGame> matchingGames = new LinkedList<ComputerGame>();
        for (ComputerGame game:games) {
            if(!game.getProp().getName().toLowerCase().equals(searchGame.getName().toLowerCase())){
                continue;
            }
            if (game.getProp().getYear() != searchGame.getYear()){
                continue;
            }
            matchingGames.add(game);
        }
        return matchingGames;
    }
}
