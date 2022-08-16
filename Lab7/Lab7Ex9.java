
/**********************************************************************************************
*                                                                                             *
*      "Factorial2"                                                                           *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 10-10-2020                                                                   *
* @Program     : Lab7Ex9                                                                      *
* @Description : Calculating the factorial that the value has been input                      *
* @Input       : An integer                                                                   *
* @Output      : The product of that factorial number with steps                              *
* @History     :                                                                              *
*      10/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab7Ex9
{
     public static void main(String[] args) {
         
         // Variable dictionary
        Scanner kb = new Scanner(System.in);
        long n;
        int limit = 1;
        
        // Prompt user to input the number
        System.out.print("n? ");
        n = kb.nextLong();
        
        // Processing while-loop
        long n1 = n;
        double fractNum = n;
        System.out.print(n);
        while (n1 > limit) {
            System.out.print(" x ");
            n1 = n1 - 1;
            System.out.print(n1);
            fractNum = fractNum * n1;
        }
        
        // Report result
        System.out.print(" = " + fractNum);
        System.out.println("\nThank you for calculating fractional_Ver.2.");
    }
}
