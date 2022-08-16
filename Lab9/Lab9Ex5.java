/**********************************************************************************************
*                                                                                             *
*      "DivisibleBy7"                                                                         *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 29-10-2020                                                                   *
* @Program     : Lab6Ex5                                                                      *
* @Description : By calling method isDivisibleBy7() to check the user enter an integer and    *
*                return the value to main() that check the num is divisible or not.           *
* @Input       : An integer                                                                   *
* @Output      : Print the value is divisible or not                                          *
* @History     :                                                                              *
*      29/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab9Ex5
{
    public static void main(String [] args) {
        
        printHeader();
        
        // Variable Dictionary
        Scanner kb = new Scanner(System.in);
        System.out.print("? ");
        int num = kb.nextInt();
        
        // Checking the num is divisible or not
        if (isDivisibleBy7(num) == 0)             // call isDivisibleBy7() with num as argument
            System.out.println(num + " is divisible by 7");
        else
            System.out.println(num + " is not divisible by 7");
            
        printFooter();
        
    }
 
    public static int isDivisibleBy7(int num) {
        int value;
        
        value = num % 7; 
        return value;
    }
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\============////////////");
        System.out.println("************DivisibleBy7************");
        System.out.println("////////////============\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Program created by YUEN, Yiu Yeung, 29-10-2020\n");
    }
    
    public static void printFooter() {
        System.out.println("\nThank you for using this <DivisibleBy7>.");
        System.out.println("The Program has terminated normally.\n");
    }
}
