
/**********************************************************************************************
*                                                                                             *
*      "PrintStar"                                                                           *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 10-10-2020                                                                   *
* @Program     : Lab7Ex7                                                                      *
* @Description : Printing the corresponding number of '*' that number has been input          *
* @Input       : A number                                                                     *
* @Output      : Corresponding number of '*'                                                  *
* @History     :                                                                              *
*      10/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab7Ex7
{
    public static void main(String[] args) {
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        int value;
        int sum = 0;                             // Limit 
        String s = "";                           // Counting Stars
        
        // Prompt user to input the number
        System.out.print("Number of stars? ");
        value = kb.nextInt();
        
        // Processing while-loop
        while (value > sum) {
            s = s + "*";
            sum = sum + 1;
        }
        
        // Report result
        System.out.println(s);
        System.out.println("\nThank you for using PrintStar.");
    }
}
