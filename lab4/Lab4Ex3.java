
/**********************************************************************************************
*                                                                                             *
*      "QuadraticEquation"                                                                    *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 30-09-2020                                                                   *
* @Program     : Lab4Ex3                                                                      *
* @Description : Calculate the two roots of a quadratic equation                              *
* @Input       : Individual value of quadratic equation(a, b and c)                           *
* @Output      : Two roots(x1 and x2)                                                         *
* @History     :                                                                              *
*      30/09/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/

import java.util.Scanner;

public class Lab4Ex3
{
    public static void main(String[] args){
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1;
        double x2;
        
        // Prompt user to input individual value
        System.out.print("Enter a: ");
        a = kb.nextDouble();
        System.out.print("Enter b: ");
        b = kb.nextDouble();
        System.out.print("Enter c: ");
        c = kb.nextDouble();
        
        // Calculate the first root
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        // Calculate the second root
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        
        // Report result
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
        System.out.println("The first root of quadratic equation = " + x1);
        System.out.println("The second root of quadratic equation = " + x2);
        System.out.println("\nThank you for using the QuadraticEquation.");
    }
}
