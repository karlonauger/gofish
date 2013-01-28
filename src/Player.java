import sun.security.krb5.internal.crypto.DesMacCksumType;

import javax.jws.HandlerChain;

/**
 * Created with IntelliJ IDEA.
 * User: Karlon
 * Date: 1/28/13
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    Hand hand = new Hand();
    Hand sets = new Hand();
    public void Player(Deck deck){
        for(int i=0; i<7; i++){
            hand.addCard(deck.removeCard());
        }
    }
    public void addCard(Card card){
        hand.addCard(card);
    }
    public boolean removeCard(Card card){
        if(hand.removeCard(card)) return true;
        else return false;
    }
    public void addSet(){
        int rank = hand.checkSet();
        if (rank==-1);
        else {
            Card h = new Card('h', rank);
            Card s = new Card('s', rank);
            Card d = new Card('d', rank);
            Card c = new Card('c', rank);
            hand.removeCard(h);
            sets.addCard(h);
            hand.removeCard(s);
            sets.addCard(s);
            hand.removeCard(d);
            sets.addCard(d);
            hand.removeCard(c);
            sets.addCard(c);
        }
    }
    public int countSets(){
        return (sets.countCards/4);
    }
}
