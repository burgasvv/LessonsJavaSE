package Classes_OOP;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;
    private char[] suits = {'♥','♦','♣','♠'};
    public Deck()
    {
        cards= new ArrayList<Card>();
        for(int i=0; i<4;i++)
        {
            for (int j=2;j<15;j++)
            {
                cards.add(new Card(j, suits[i]));
            }
        }
    }
    public Card getCard()
    {
        if (!cards.isEmpty())
        {
            Card result = cards.get(0);
            cards.remove(0);
            return result;
        }
        return null;
    }
    public void Shuffle()
    {
        for (int i=0; i< cards.size();i++)
        {
            int r = (int)(Math.random()*cards.size());
            Card temp = cards.get(r);// cards[i];
            cards.set(r, cards.get(i));
            cards.set(i, temp);
        }
    }
}