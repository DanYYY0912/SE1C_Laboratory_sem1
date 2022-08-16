
/**********************************************************************************************
*                                                                                             *
*      "Factorial"                                                                            *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 10-10-2020                                                                   *
* @Program     : Lab7Ex8                                                                      *
* @Description : Calculating the factorial that the value has been input                      *
* @Input       : An integer                                                                   *
* @Output      : The product of that factorial number                                         *
* @History     :                                                                              *
*      10/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab7Ex8
{
    public static void main(String[] args) {
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        long n;
        double fractNum = 1;
        int limit = 1;
        
        // Prompt user to input the number
        System.out.print("n? ");
        n = kb.nextLong();
        
        // Processing while-loop
        while (n >= limit) {
            fractNum = fractNum * limit;
            limit = limit + 1;
        }
        
        // Report result
        System.out.println(n + "! " + "= " + fractNum);
        System.out.println("\nThank you for calculating fractional.");

    }
}
