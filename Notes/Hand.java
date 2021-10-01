
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Hand
{
    private int card1;
    private int card2;
    private int total;

    public Hand(){
        card1 = hit();
        card2 = hit();
    }

    public int hit(){
        int newCard = (int)(Math.random() * 7 + 2);
        total += newCard;
        return newCard;
    }

    public int getCard1(){      
        return card1;   
    }

    public int getCard2(){
        return card2;
    }
    public int getTotal(){
        return total;
        
    }
}
