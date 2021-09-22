
/**
 * Write a description of class BlackJack here.
 *
 * @author (Eduardo Garcia)
 * @version (9/15/2021)
 */
import java.util.Scanner;
import java.lang.String;
public class BlackJack
{
 public static void main(){
     Hand user = new Hand();
     Hand dealer = new Hand();
     System.out.println ("Your first card is " + user.card1);
     System.out.println("The dealer's showing card is " + dealer.card1);
     System.out.println("Your second card is " + user.card2);
     System.out.println("Your total is " + user.total);
     Scanner scanner = new Scanner(System.in);
     int addCard = (int)(Math.random() * 7 + 2);
     String hit = ("hit");
     while(user.total < 21 ){
         
            if(scanner.equals ("hit")){
                System.out.println("Your new card is " + addCard);
                user.total += addCard;
                
                
            }
            
         }
         
         
     }
}

