import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlayerTest {

    Player player;
    Hand hand;
    Deck deck;

    @Before
    public void before(){
        hand = new Hand();
        player = new Player("player1", hand);
        deck = new Deck();
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

}
