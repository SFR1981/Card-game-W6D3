public class Player {

    Hand hand;
    String name;

    public Player(String name, Hand hand){
        this.name = name;
        this.hand = hand;
    }


    public String getName(){
        return this.name;
    }

    public int getScore(){
        return hand.score();
    }

    public void getDealt(Card card){
        this.hand.addToHand(card);
    }
}
