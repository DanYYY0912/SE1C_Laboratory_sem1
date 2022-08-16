
/**********************************************************************************************
*                                                                                             *
*      "Statistics"                                                                           *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 24-10-2020                                                                   *
* @Program     : Lab8Ex8                                                                      *
* @Description : Calculating Sum,Mean,Maximum,Minimum and Standard Deviation with 10 numbers  *
* @Input       : 10 positive real numbers but no negative value                               *
* @Output      : SUM, Mean, Maximum, Minimum and Standard Deviation                           *
* @History     :                                                                              *
*      24/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.*;
public class Lab8Ex8
{
    public static void main(String args[]) {
        
        // Variable Dictionary
        Scanner kb = new Scanner(System.in);
        int count = 0;
        int times = 0;
        int num = 0;
        int limit = 0;
        double value = 0;
        double sum = 0;
        double mean = 0;
        double max = 0;
        double min = 0;
        double SM = 0;
        double SD = 0;
        
        // Prompt user to input positive real numbers
        double [] valArray = new double [10];
        for (times = 0; times < 10; times++) {
            System.out.print("Enter a positive real number = ");
            value = kb.nextDouble();
            if (value == 0) {
                System.out.println("Please enter a POSITIVE REAL NUMBER but no neutral number!");
                times = 0;
                continue;
            }else if(value < 0)
                  break;
            else   
                  valArray[num] = value;
                  num++;
                  limit++;
        }
        
        // Processing - Caculate the statistics
        
        // 1. Sum
        for (num = 0; num < limit; num++) {
            sum = valArray[num] + sum;
        }
        
        // 2. Mean
        mean = sum / limit;

        // 3. Maximum
        num = 0;
        if( valArray[num] > valArray[num + 1])
                max = valArray[num];
            else
                max = valArray[num + 1];
        for (num = 2; num < limit; num++) {
            if( valArray[num] > max)
                max = valArray[num];
            else
                max = max;
        }
        
        // 4. Minimum
        num = 0;
        if( valArray[num] > valArray[num + 1])
                min = valArray[num + 1];
            else
                min = valArray[num];
        for (num = 2; num < limit; num++) {
            if( valArray[num] > min)
                min = min;
            else
                min = valArray[num];
        }
        
        // 5. Standard Deviation
        for (num = 0; num < limit; num++) {
            SM = (valArray[num] - mean) * (valArray[num] - mean) + SM;
        }
        SD = Math.sqrt(SM / (limit-1));
        
        // Report result
        System.out.println("Sum = " + String.format("%.3g", sum));
        System.out.println("Mean = " + String.format("%.3g", mean));
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Stand Deviation = " + String.format("%.3g", SD));
        System.out.println("\nThank you for using this Statistics.");
    }
}
