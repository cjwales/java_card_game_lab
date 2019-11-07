import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private Random random;
    private ArrayList<Card> cards;


    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void fillDeck() {
        for (CardRank rank : CardRank.values()) {
            for (SuitType suit : SuitType.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public void dealRandomCard(PlayerHand playerHand) {
        Random random = new Random();
        int randomNumber = random.nextInt(52);
        Card result = cards.get(randomNumber);
        playerHand.receiveCard(result);
    }
}
