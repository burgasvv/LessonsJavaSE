package PatternsRealisation.Memento;

import java.util.ArrayList;

public class PlayerHistory {
    private final ArrayList<Player>players;

    public PlayerHistory() {
        players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void add(Player player){
        players.add(player);
    }

    public void remove(Player player){
        players.remove(player);
    }
    public Player get(int index){
        return players.get(index);
    }
}
