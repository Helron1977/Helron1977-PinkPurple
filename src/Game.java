import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;

public class Game {
    public List<Player> players;

    public Game() {
        players = new ArrayList<Player>();
    }

    void generatePlayers(List<String> playerNames) {
        for (String playerName : playerNames) {
            players.add(new Player(playerName));
        }
    }

}
