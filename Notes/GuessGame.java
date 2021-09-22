
/**
 * Write a description of class GuessGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.Scanner;
public class GuessGame
{
 /*Guessgame Requirements
     * Computer generates a random number from 1 to 50
     * You get 15 tries to guess the number 
     * After each guess, the computer will tell you to guess higher or lower
     * The program ends when guesses have run out or if you guessed correctly
     */
    public static void chooseRandomNumber(){
        int num = (int)(Math.random() * 50 + 1);
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        
        System.out.println("Guess a number between 1-50");
        while (i < 15){
                      int number = scanner.nextInt();
            if(number < num){
                System.out.println("Guess a number higher");
                i ++;
            }else if(number > num){
                System.out.println("Guess a number lower");
                i ++;

            }else if (number == num){
                System.out.println ("You guessed correctly!");
                i = 15;
                
            }
        }

    } 
}  


