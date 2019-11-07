import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.SPADES, CardRank.ACE);
    }

    @Test
    public void canGetCardSuit() {
        assertEquals(SuitType.SPADES, card.getSuit());
    }

    @Test
    public void canGetCardRank() {
        assertEquals(CardRank.ACE, card.getRank());
    }

    @Test
    public void kingHasValue() {
        card = new Card(SuitType.HEARTS, CardRank.KING);
        assertEquals(10, card.getValueFromEnum());
    }
}
