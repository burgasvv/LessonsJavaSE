package Classes_OOP;

public class Pocker {
    private Deck deck;
    private Card[] table;
    private int n=5;
    public Pocker()
    {
        deck= new Deck();
        deck.Shuffle();
        table = new Card[n];
    }
    private int Count (int start)
    {
        int count=1;
        for (int i =start ;i<n-1;i++)
        {
            if (table[i].getNominal()==table[i+1].getNominal())
                count++;
            else
                return count;
        }
        return count;
    }
    private void SortTable()
    {
        for (int i =0; i<n;i++)
        {
            for (int j=0; j<n-1-i;j++)
            {
                if (table[j].getNominal()>table[j+1].getNominal())
                {
                    Card temp = table[j];
                    table[j]=table[j+1];
                    table[j+1]=temp;
                }
            }
        }
    }
    private boolean StreetFlash()
    {
        return Street() && Flash();
    }
    private boolean FlashRoyal()
    {
        return StreetFlash() && table[0].getNominal()==10;
    }
    private boolean Kare()
    {
        return Count(0)==4 || Count(1)==4;
    }
    private boolean Thrid ()
    {
        return Count(0)==3 || Count(1)==3 || Count(2)==3;
    }
    private boolean Street()
    {
        for (int i =0; i<n-1;i++)
        {
            if (table[i].getNominal()+1!=table[i+1].getNominal())
                return false;
        }
        return true;
    }
    private boolean Flash()
    {
        for(int i=1; i<n;i++)
        {
            if (table[0].getSuit()!=table[i].getSuit())
                return false;
        }
        return true;
    }
    private boolean TwoPair()
    {
        int count =0;
        for (int i=0; i<n-1;i++)
            if (Count(i)==2)
                count++;
        return count==2;
    }
    private boolean Pair()
    {
        for (int i=0; i<n-1;i++)
            if (Count(i)==2)
                return true;
        return false;
    }
    private boolean FullHouse()
    {
        return Count(0)==3 && Count(3)==2 ||
                Count(0)==2 && Count(2)==3;
    }

    public void NewRound()
    {
        for(int i=0; i<n;i++)
        {
            table[i]=deck.getCard();
            table[i].Show();
        }
        SortTable();
    }
    public void CheckCombination()
    {
        if (FlashRoyal()) System.out.println("Флеш рояль");
        else if (StreetFlash()) System.out.println("Стрит Флеш");
        else if (Kare()) System.out.println("Каре");
        else if (FullHouse()) System.out.println("Фулл Хаус");
        else if (Flash()) System.out.println("Флеш");
        else if (Street()) System.out.println("Стрит");
        else if (Thrid()) System.out.println("Тройка");
        else if (TwoPair()) System.out.println("Две пары");
        else if (Pair()) System.out.println("Пара");
        else {
            System.out.println("Старшая карта ");
            table[4].Show();
        }
    }
}