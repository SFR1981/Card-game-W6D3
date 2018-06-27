import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    Deck deck;

    public Game(){
        this.players = new ArrayList<>();
        deck = new Deck();
        deck.newDeck();
    }

    public int getPlayers(){
        return players.size();
    }

    public void addPLayer(Player player){
        players.add(player);
    }

    public void dealSingleCard(Player player, Deck deck){
        Card card = deck.removeCard();
        player.getDealt(card);
    }

    public void dealRound(){
        for (Player player : players){
            Card card = deck.removeCard();
            player.getDealt(card);
        }

    }

}
