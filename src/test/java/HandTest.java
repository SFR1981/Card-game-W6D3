import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;
    Deck deck;

    @Before
    public void before() {
        hand = new Hand();
        deck = new Deck();
    }

    @Test
    public void canGetCards() {
        assertEquals(0, hand.getHand());
    }

    @Test
    public void canAddCard() {
        deck.newDeck();
        Card card = deck.removeCard();
        hand.addToHand(card);
        assertEquals(1, hand.getHand());
    }

}
