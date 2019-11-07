import java.util.ArrayList;

public class PlayerHand {

    private ArrayList<Card> cards;

    public PlayerHand() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void receiveCard(Card newCard) {
        this.cards.add(newCard);
    }
}
