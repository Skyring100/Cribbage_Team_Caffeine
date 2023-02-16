/**
 * Has all the card types present in a standard deck of cards, from numbers 1-10 to kings and aces.
 */
public enum Rank {
    JOKER(0,"?"),ACE(1,"A"),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10,"T"),JACK(10,"J"),QUEEN(10,"Q"),KING(10,"K");
    private final int value;
    private final String symbol;
    Rank(int i, String s){
        this.value = i;
        this.symbol = s;
    }
    Rank(int i){
        this.value = i;
        this.symbol = String.valueOf(i);
    }

    public int getCount(){
        return value;
    }
    public String toShortString(){
        return symbol;
    }
    public String getName(){
        //this name() method is inherited, not one of our own created values
        return this.name();
    }
}
