/**********************************************************************************************
*                                                                                             *
*      "IdealAgeOfWife"                                                                       *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 29-10-2020                                                                   *
* @Program     : Lab9Ex4                                                                      *
* @Description : By calling method idealAge() to process the user input a man's age, then it  *
*                would return the ideal age of his wife to main() and print the output.       *
* @Input       : A man's age                                                                  *
* @Output      : The ideal age of the man's age that the user has input                       *
* @History     :                                                                              *
*      29/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab9Ex4
{
    public static void main(String [] args) {
        
        printHeader();
        
        // Variable Dictionary
        Scanner kb = new Scanner(System.in);
        int manAge = kb.nextInt();
        int wifeAge = 0;
        
        wifeAge = idealAge(manAge);                  // call idealAge() with manAge as argument
        System.out.println("Ideal age of wife = " + wifeAge);
        
        printFooter();
        
    }
   
    public static int idealAge(int manAge) {
        int wifeAge;
        
        wifeAge =  manAge / 2 + 7;
        return wifeAge;
    } 
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\==============////////////");
        System.out.println("************IdealAgeOfWife************");
        System.out.println("////////////==============\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Program created by YUEN, Yiu Yeung, 29-10-2020\n");
    }
    
    public static void printFooter() {
        System.out.println("\nThank you for using this <IdealAgeOfWife>.");
        System.out.println("The Program has terminated normally.\n");
    }
}
