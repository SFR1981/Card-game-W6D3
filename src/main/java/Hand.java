import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public int getHand() {
        return hand.size();
    }

    public void addToHand(Card card){
        this.hand.add(card);
    }

}
