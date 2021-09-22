
/**
 * Write a description of class TaxCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class TaxCalc
{
   public static void grossIncome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your gross income ");
        double GrossIn = scanner.nextDouble();
        System.out.println("Gross Income: " + GrossIn);
        System.out.println("Enter the number of dependents: ");
        int NumInd = scanner.nextInt();
        System.out.println("Number of Independents: " + NumInd);
        System.out.println(GrossIn - 10000 + NumInd * 2000 * .2);
        
     
        
                
        
        
        
        
        
        
    }
    }


