/**********************************************************************************************
*                                                                                             *
*      QuadraticEquation&Discriminant                                                         *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 01-10-2020                                                                   *
* @Program     : Lab6Ex9                                                                      *
* @Description : Determine the number of root and calculate the roots                         *
* @Input       : Individual value of quadratic equation(a, b and c)                           *
* @Output      : Number of roots and the corresponding value                                  *
* @History     :                                                                              *
*      01/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
        
import java.util.Scanner;

public class Lab6Ex9
{
    public static void main(String[] args){
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        int a;
        int b;
        int c;
        double x;
        double x1;
        double x2;
        int discriminant;
        
        // Prompt user to input individual value
        System.out.print("Enter a: ");
        a = kb.nextInt();
        System.out.print("Enter b: ");
        b = kb.nextInt();
        System.out.print("Enter c: ");
        c = kb.nextInt();
        
        // Calculate the discriminant
        discriminant = (int)Math.pow(b, 2) - 4 * a * c;
        
        // Calculate the root
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        
        // Calculate the first root
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        // Calculate the second root
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
           
        // Determine the number of roots
        if (discriminant > 0){
            System.out.println("Discriminant is " + discriminant);
            System.out.println("2 roots, x1="+ x1+", x2="+ x2);   
        }else if (discriminant == 0){
            System.out.println("Discriminant is " + discriminant);
            System.out.println("1 root, x="+ x);
        }else if (discriminant < 0){
            System.out.println("Discriminant is " + discriminant);
            System.out.println("No root");
        }else
            System.out.println("Discriminant is " + discriminant);
            System.out.println("Not a quadratic eq.");
        
        // Report result
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    
    }
}
