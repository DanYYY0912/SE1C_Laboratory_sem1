
/**********************************************************************************************
*                                                                                             *
*      BreakCoins                                                                             *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 28-09-2020                                                                   *
* @Program     : Lab 3 Ex8                                                                    *
* @Description : Calculate the minimum number of coins for corresponding amounts of dollars   *
* @Input       : An amount                                                                    *
* @Output      : Number of coins                                                              *
* @History     :                                                                              *
*      28/09/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/

import java.util.Scanner;

public class Lab3Ex8
{
    public static void main(String[] args){

        // Declare variable
        Scanner kb = new Scanner(System.in);                 // setup keyboard as input source
        int amount;                               
        int c10;                                             // 10-dollar coin(s)
        int c5;                                              // 5-dollar coin(s)
        int c2;                                              // 2-dollar coin(s)
        int c1;                                              // 1-dollar coin(s)
        
        // Prompt user for input and read data from keyboard
        System.out.print("Input an amount: ");
        amount = kb.nextInt();                               // input an amount
        System.out.println("The minimum numbers of coins for " + amount + " dollars are:");
        
        // Processing - calculate the minimum number of coins
           c10 = amount/10;
           c5  = amount%10/5;
           c2  = amount%10%5/2;
           c1  = amount%10%5%2/1;
        
        // Report result
        System.out.println("10-dollar coin(s): "+ c10);
        System.out.println("5-dollar coin(s): "+ c5); // Expecting print 1
        System.out.println("2-dollar coin(s): "+ c2);
        System.out.print("1-dollar coin(s): "+ c1);
        
        System.out.println("\nThank you for using this calculator.");
    }
}
