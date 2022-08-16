/**********************************************************************************************
*                                                                                             *
*      "CountDown"                                                                            *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 29-10-2020                                                                   *
* @Program     : Lab9Ex3                                                                      *
* @Description : By calling method countDown() to process the user enter an integer value and *
*                print the counting down of the integer.                                      *
* @Input       : An integer value                                                             *
* @Output      : Print the counting down of the integer that the user has entered             *
* @History     :                                                                              *
*      29/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab9Ex3
{
    public static void main(String [] args) {
        
        printHeader();
        
        // Variable Dictionary
        Scanner kb = new Scanner(System.in);
        System.out.print("? ");
        int num = kb.nextInt();
        
        countDown(num);                                                     // call countDown()
        
        printFooter();
        
    }
 
    public static void countDown(int num) {
        System.out.print(num);
        while (num > 1) {
            System.out.print(" ");
            num--;
            System.out.print(num);
        }
    }
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\=========////////////");
        System.out.println("************CountDown************");
        System.out.println("////////////=========\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Program created by YUEN, Yiu Yeung, 29-10-2020\n");
    }
    
    public static void printFooter() {
        System.out.println("\nThank you for using this <CountDown>.");
        System.out.println("The Program has terminated normally.\n");
    }
}
