
/**
 * Write a description of class ReadingInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; //We are using it, but not on AP test
public class ReadingInput
{
    public static void main(){
        int a =10;
        /*
         * Scanner scanner; //Declaration
         * scanner = new Scanner(System.in); //Instantiation
         */
        Scanner scanner;
        scanner = new Scanner(System.in); //Instantiation
        
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello " + name); 
        System.out.println("What is your quest?");
        String quest = scanner.next();
        System.out.println("What is your favorite color?");
        String color = scanner.next();
    }     
    /** This method uses a scanner to ask for a person's name.
     * 
     * 
     */    
    public static void inputName(){
        Scanner theThing = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = theThing.next();
        System.out.println("Hello " + name);
    } 
    /**
     * 
     */
    public static void aNumber(){
        Scanner the = new Scanner(System.in);
        System.out.println("Insert a number");
        int number = the.nextInt();
        System.out.println("Your number is " + number);
        int nextNum = number + 1;
        System.out.println("The next number would be " + nextNum);
        
        
    }
    public static void aBetterNumber(){
        Scanner the = new Scanner(System.in);
        System.out.println("Insert a number");
        int number = the.nextInt();
        System.out.println("Your number is " + number);
        number++;
        System.out.println("The next number would be " + number);
        number--;
        System.out.println(number);
        
    
    }
}