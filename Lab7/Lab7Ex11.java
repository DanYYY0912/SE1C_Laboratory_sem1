
/**********************************************************************************************
*                                                                                             *
*      "AvgValues2"                                                                           *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 10-10-2020                                                                   *
* @Program     : Lab7Ex11                                                                     *
* @Description : Calculate and print the average of the values                                *
* @Input       : Values                                                                       *
* @Output      : Average of those values have been input                                      *
* @History     :                                                                              *
*      10/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab7Ex11
{
    public static void main(String[] args) {
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        int i = 0;                          // Limitation
        int value;                          // For store each values
        int n = 0;
        int sum = 0;
        double avg = 0;
        
        // Prompt user to input the value
        System.out.print("Value? ");
        value = kb.nextInt();
        // Processing while loop
        while (value > 0) {
            sum = sum + value;
            System.out.print("Value? ");
            value = kb.nextInt();
            i = i + 1;
            n = n + 1;
        }
        
        // Calculating the average
        avg = (double) sum / n;
        
        // Report result
        System.out.print("Average = " + avg);
        System.out.println("\nThank you for calculating the average of values-Ver.2.");

    }
}
