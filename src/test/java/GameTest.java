import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck deck;
    Player player1;
    Player player2;
    Hand hand1;
    Hand hand2;
    Game game;

    @Before
    public void before(){
        deck = new Deck();
        hand1 = new Hand();
        hand2 = new Hand();
        player1 = new Player("A", hand1);
        player2 = new Player("B", hand2);
        game = new Game();
    }

    @Test
    public void hasZeroPlayers(){
        assertEquals(0, game.getPlayers());
    }

    @Test
    public void gameDeal(){
        deck.newDeck();
        game.dealSingleCard(player1, deck);
        System.out.println(player1.getScore());
        System.out.println(player1.getScore());
    }

    @Test
    public void canAddPlayer(){
        game.addPLayer(player1);
        game.addPLayer(player2);
        assertEquals(2, game.getPlayers());
    }

    @Test
    public void canDealRound(){
        deck.newDeck();
        game.addPLayer(player1);
        game.addPLayer(player2);
        game.dealRound();
        game.dealRound();
        System.out.println(player1.getScore());
        System.out.println(player2.getScore());
        System.out.println(game.winnerIs());

    }

}

