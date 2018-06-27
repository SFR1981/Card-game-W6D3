import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlayerTest {

    Player player;
    Player player2;
    Hand hand;
    Hand hand2;
    Deck deck;

    @Before
    public void before(){
        hand = new Hand();
        hand2 = new Hand();
        player = new Player("player1", hand);
        deck = new Deck();
        player2 = new Player( "Player 2", hand2);
    }

    @Test
    public void playerHasName(){
        assertEquals("player1", player.getName());
    }


    @Test
    public void playerHasHand(){
        assertEquals(0, player.getScore());
    }

    @Test
    public void playerHasGoodHand(){
        deck.newDeck();
        Card card = deck.removeCard();
        player.getDealt(card);
        card = deck.removeCard();
        player.getDealt(card);
        int score = player.getScore();
        System.out.println(score);

    }


    @Test
    public void game(){
        deck.newDeck();
        Card card = deck.removeCard();
        player.getDealt(card);
        Card card2 = deck.removeCard();
        player2.getDealt(card2);
        int player1score = player.getScore();
        int player2score = player2.getScore();
        System.out.println(player1score);
        System.out.println(player2score);



    }

}
