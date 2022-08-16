/**********************************************************************************************
*                                                                                             *
*      "PythagoreanTheorem"                                                                   *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 29-10-2020                                                                   *
* @Program     : Lab9Ex6                                                                      *
* @Description : Calling PythTheorem() to check the three value of users' input that can it   *
*                be formed as a right-angled.                                                 *
* @Input       : coeffA, coeffB, coeffC                                                       *
* @Output      : It is a right-angle triangle or not                                          *
* @History     :                                                                              *
*      29/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab9Ex6
{
    public static void main(String[] args) {
        
        printHeader();
        
        // Variable Dictionary
        Scanner kb = new Scanner(System.in);
        double coeffA;
        double coeffB;
        double coeffC;
        boolean check;
        
        // Prompt user to input the required coefficient
        System.out.println("Please enter coeffA, coeffB, coeffC as sides of triangle a, b and c respectively.");
        System.out.print("coeffA? ");
        coeffA = kb.nextDouble();
        System.out.print("coeffB? ");
        coeffB = kb.nextDouble();
        System.out.print("coeffC? ");
        coeffC = kb.nextDouble();
        PythTheorem(coeffA, coeffB, coeffC);
        
        printFooter();
        
        }
    
    public static void PythTheorem(double a, double b, double c) {
        if (c * c == a * a + b * b)
            System.out.println("It is a right-angle triangle.");
        else
            System.out.println("It is not a right-angle triangle.");
    }
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\==================////////////");
        System.out.println("************PythagoreanTheorem************");
        System.out.println("////////////==================\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Program created by YUEN, Yiu Yeung, 29-10-2020\n");
    }
    
    public static void printFooter() {
        System.out.println("\nThank you for using this <PythagoreanTheorem>.");
        System.out.println("The Program has terminated normally.\n");
    }
}
