/**********************************************************************************************
*                                                                                             *
*      "java Pattern"                                                                         *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 20-10-2020                                                                   *
* @Program     : Lab8Ex6a                                                                     *
* @Description : Printing a pattern with number of lines                                      *
* @Input       : A number                                                                     *
* @Output      : Pattern with the number of lines (Left to Right)                             *
* @History     :                                                                              *
*      20/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab8Ex6a
{
    public static void main(String args[]) {

        // Variable Dictionary
        Scanner kb = new Scanner(System.in);
        int num = 0;
        int numAdd = 0;
        
        // Prompt user to input a number
        System.out.print("Number? ");
        num = kb.nextInt();
        
        // Processing - Pattern with number of lines
        for(int nextRow = 1; nextRow <= num; nextRow++) { 
            numAdd = 0;
            for(int numSq = 1; numSq <= nextRow; numSq++)         // Printing number sequence
                System.out.print(numAdd = numAdd + 1);
                System.out.println();
        }
        
        // Report result
        System.out.println("\nThank you for printing java Pattern.");
    }
}
