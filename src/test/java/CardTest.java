import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        SuitType[] values = SuitType.values();
        card = new Card(SuitType.SPADES, RankType.KING);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.SPADES, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.KING, card.getRank());
    }

    @Test
    public void kingHasValueThirteen(){
        assertEquals(13, card.getValueFromEnum());
    }
}
