import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;


public Deck(){
    this.cards = new ArrayList<>();
}


public int getCards(){
    return cards.size();
}


public void newDeck(){
    for (RankType rank : RankType.values()){
        for (SuitType suit : SuitType.values()){
            Card card = new Card(suit, rank);
            cards.add(card);
        }
        Collections.shuffle(cards);
    }

}


public Card removeCard() {
    return cards.remove(0);
}






}
