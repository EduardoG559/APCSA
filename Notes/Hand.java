
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Hand
{
    public int card1;
    public int card2;
    public int total;

    public Hand(){
      card1 = hit();
      card2 = hit();
    }
    public int hit(){
        int newCard = (int)(Math.random() * 7 + 2);
        total += newCard;
        return newCard;
    }

    }
