public interface CardInterface {
    Rank getRank() ;
    Suit getSuit() ;
    int getCribCount() ;
    String toString() ;

    //not sure if these are even supposed to be here
    //static Card getCard(Rank r, Suit s){return new Card(r,s);};
    //static Card getCard(int i){return new Card(i);};
}
