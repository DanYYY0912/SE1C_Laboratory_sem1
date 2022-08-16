
/**********************************************************************************************
*                                                                                             *
*      "SumOfSeriesOfSinx"                                                                    *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 24-10-2020                                                                   *
* @Program     : Lab8Ex9                                                                      *
* @Description : Calculate the sin x by sum of series                                         *
* @Input       : Input radians                                                                *
* @Output      : sin x                                                                        *
* @History     :                                                                              *
*      24/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.*;
public class Lab8Ex9
{
    public static void main(String[] args) {
        
        // Variable Dictionary
        Scanner kb = new Scanner(System.in);
        final double MAXIMUM = 3.1416;
        final double MINIMUM = -3.1416;
        double x = 0;
        int count = 0;
        int factNum = 1;
        double sinX = 0;
        double sum = 0;
        
        // Prompt user to input the radians
        while (x == 0) {
            System.out.print("\nPlease enter the radians = ");
            x = kb.nextDouble();
            if (x > MINIMUM && x < MAXIMUM)
                for (int num = 3; num <= 5; num = num + 2) {
                  count = num;
                      while (count >= 1 ) {
                          factNum = count * factNum;
                          count--;
                      }
                  sum = (Math.pow(x,(double)num) / (factNum) ) + sum;
                  factNum = 1;                                       // return factNum to 1 for doing factorial algorithm
                      System.out.println(sum);
                }
            else
                System.out.println("Please enter the radians BETWEEN IN -3.1414 AND 3.1416");
        }
        
        // Caculating
        sinX = x - sum; 
        
        // Report result
        if (x > MINIMUM && x < MAXIMUM) {
            System.out.println("The sin(" + x + ") is " + sinX + ".");
            System.out.println("\nThank you for calculating sin(x).");
        } else
              System.out.println("\nPlease try again.");
    }
}
