
/**********************************************************************************************
*                                                                                             *
*      "AvgValues"                                                                            *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 10-10-2020                                                                   *
* @Program     : Lab7Ex10                                                                     *
* @Description : Calculate and print the average of the values                                *
* @Input       : Number of values and each values                                             *
* @Output      : Average of those values have been input                                      *
* @History     :                                                                              *
*      10/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab7Ex10
{
    public static void main(String[] args) {
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        int i = 0;                          // Limitation
        int n;                              // Number of values
        int value;                          // For store each values
        int sum = 0;
        double avg = 0;
        
        // Prompt user to input values
        System.out.print("How many values to enter? ");
        n = kb.nextInt();
        
        // Processing while loop
        while (i < n) {
            System.out.print("Value? ");
            value = kb.nextInt();
            sum = sum + value;
            i = i + 1;
        }
        
        // Calculating the average
        avg = (double) sum / n;
        
        // Report result
        System.out.print("Average = " + avg);
        System.out.println("\nThank you for calculating the average of values.");

    }
}
