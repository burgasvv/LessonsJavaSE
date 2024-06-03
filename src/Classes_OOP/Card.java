package Classes_OOP;

public class Card {
    private int nominal;
    private char suit;
    public Card (int nominal, char suit) {
        this.suit=  suit;
        this.nominal=nominal;
    }
    public int  getNominal() {return nominal;}
    public char getSuit() {return suit;}
    public void Show() {
        switch (nominal) {
            case 11 -> System.out.print("J");
            case 12 -> System.out.print("Q");
            case 13 -> System.out.print("K");
            case 14 -> System.out.print("A");
            default -> System.out.print(nominal);
        }
        System.out.print(suit+" ");
    }
}