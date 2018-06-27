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


    public String winnerIs(){
        int total = 0;
        String winner = "";
        for (Player player : players){
           if (player.getScore() > total){
               total = player.getScore();
               winner = player.getName();
            }
        }
            return "the winner is " + winner + " with a score of " + String.valueOf(total) +"!" ;



        }


        public String winners(){
            for (Player player : players){
                return player.name() + "'"
                }

        }
    }


