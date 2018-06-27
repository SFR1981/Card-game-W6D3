import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canGetCards() {
        assertEquals(0, deck.getCards());
    }


    @Test
    public void hasNewDeck() {
        deck.newDeck();
        assertEquals(52, deck.getCards());

    }

    @Test
    public void canTakeCard(){
        deck.newDeck();
        deck.removeCard();
        assertEquals(51, deck.getCards());
    }

    @Test
    public void showCard(){
        deck.newDeck();
        Card card = deck.removeCard();
        System.out.println(card.getSuit());
        System.out.println(card.getRank());
    }
}