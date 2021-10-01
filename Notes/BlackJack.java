
/**
 * Write a description of class BlackJack here.
 *
 * @author (Eduardo Garcia)
 * @version (9/15/2021)   
 */
import java.util.Scanner;
public class BlackJack
{
 public static void main(){
     Hand user = new Hand();
     Hand dealer = new Hand();
     System.out.println ("Your first card is " + user.getCard1());
     System.out.println("The dealer's showing card is " + dealer.getCard1());
     System.out.println("Your second card is " + user.getCard2());
     System.out.println("Your total is " + user.getTotal());
     Scanner scanner = new Scanner(System.in);
     String input = scanner.next();
     while(user.getTotal() <= 21 ){
         
            if(input.equals ("hit")){
                int newCard = user.hit();
                System.out.println("Your new card is " + user.hit());
                System.out.println(user.getTotal());
             
                
            }else if(input.equals ("stay")){
                System.out.println("Your final total is " + 
                user.getTotal() + ". The dealer will now draw.");
                return;
                
            }else if(user.getTotal() > 21){
               System.out.println("You bust!");
               System.out.println("Dealer wins");
            
            
            }else if(user.getTotal() == 21){
                System.out.println("BlackJack! Dealer will now draw");
                while(dealer.getTotal() <= 17){
                    
                    
                    
                    
                }
            }
            
         }
         
         
     }
}

