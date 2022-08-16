
/**********************************************************************************************
*                                                                                             *
*      "CylinderFormula"                                                                      *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 29-09-2020                                                                   *
* @Program     : Lab4Ex1                                                                      *
* @Description : Calculate the volume of a cylinder (with console I/O)                        *
* @Input       : radius and length                                                            *
* @Output      : volume of a cylinder                                                         *
* @History     :                                                                              *
*      29/09/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/

import java.util.Scanner;

public class Lab4Ex1{
    
    public static void main(String[] args) {
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);                   // Setup keyboard as input source
        final double PI = 3.1415926;                           // PI constant value
        double radius;                                         // Radius of the cylinder
        double length;                                         // Length of the cylinder
        double volume;                                         // Volume of the cylinder
        
        //Prompt user for input and read data from keyboard
        System.out.print("Enter Radius: ");
        radius = kb.nextDouble();
        System.out.print("Enter Length: ");
        length = kb.nextDouble();
        
        // Calculate volume of cylinder base on formula
        volume = Math.pow(radius, 2) * PI * length;
        
        // Report result
        System.out.println("The volume of the cylinder = " + volume);
        System.out.println("\nThank you for using CylinderFormula.");
        
    }
}
