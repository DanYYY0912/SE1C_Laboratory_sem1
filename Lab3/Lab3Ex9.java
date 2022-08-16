
/******************************************************************************************************************
*                                                                                                                 *
*      GeometricSeries                                                                                            *
*                                                                                                                 *
* @Name        : YUEN YIU YEUNG                                                                                   *
* @StudentID   : 200171873                                                                                        *
* @Class       : IT114105/1C                                                                                      *
* @Date        : 28-09-2020                                                                                       *
* @Program     : Lab 3 Ex9                                                                                        *
* @Description : Calculate the sum of the geometric series                                                        *
* @Input       : Individual value(First term, Common ratio, Number of terms)                                      *
* @Output      : Number of coins                                                                                  *
* @History     :                                                                                                  *
*      28/09/2020    new today                                                                                    *
*                                                                                                                 *
*******************************************************************************************************************/

import java.util.Scanner;
 
public class Lab3Ex9
{
    public static void main(String[] args){
       
        // Output program message  
        header();
           
        // Declare variable
        Scanner kb = new Scanner(System.in);
        double S;                                                                      // Sum of the first n terms
        int a;                                                                         // First term
        double r;                                                                      // Common ratio
        int n;                                                                         // Number of terms
        
        // Prompt user for input and read data from keyboard
        System.out.print("Enter (a) for FirstTerm: ");                
        a = kb.nextInt();                                                              // Input First Term
        System.out.print("Enter (r) for CommonRatio: ");                
        r = kb.nextDouble();                                                           // Input Common Ratio
        System.out.print("Enter (n) for NumOfTerms: ");                
        n = kb.nextInt();                                                              // Input Number Of Terms
        
        // Processing - calculate the sum of a geometric series
        S = (a * (Math.pow(r, n)-1)) / (r - 1); 
           
        // Output result
        System.out.println("The sum of the first " + n + " terms are " + S + ".");  // Assignment statement
           
        // Report program completely done
        footer();
    }
    
    public static void header(){
        
        System.out.println("Program written by Danny YUEN");
        System.out.println("------------------------------");
        System.out.println("This program is used to calculate the sum of a geometric series");
    }
    
    public static void footer(){
        
        System.out.println("\nProgram has normally terminated.");
    }    
}
