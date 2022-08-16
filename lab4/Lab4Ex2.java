
/**********************************************************************************************
*                                                                                             *
*      "CylinderFormula"                                                                      *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 30-09-2020                                                                   *
* @Program     : Lab4Ex2                                                                      *
* @Description : Calculate the volume of a cylinder (with dialog and message boxes)           *
* @Input       : radius and length                                                            *
* @Output      : volume of a cylinder                                                         *
* @History     :                                                                              *
*      30/09/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/

import javax.swing.JOptionPane;

public class Lab4Ex2{
    
    public static void main(String[] args) {
        
        // Variable dictionary
        String input;                                          // To hold String input
        final double PI = 3.1415926;                           // pi constant value
        double radius;                                         // To hold radius
        double length;                                         // To hold length
        double volume;                                         // To hold volume
        
        // Prompt user to input for holding radius
        input = JOptionPane.showInputDialog(null,
            "Enter Radius",
            "Input",
            JOptionPane.QUESTION_MESSAGE);

        radius = Double.parseDouble(input);
        
        // Prompt user to input for holding length
        input = JOptionPane.showInputDialog(null,
            "Enter Length",
            "Input",
            JOptionPane.QUESTION_MESSAGE);
            
        length = Double.parseDouble(input);

        // Calculate volume of cylinder base on formula
        volume = Math.pow(radius, 2) * PI * length;
        
        // Display volume of cylinder
        JOptionPane.showMessageDialog(null,
            "The volume of cylinder = " + volume,
            "Result",
            JOptionPane.INFORMATION_MESSAGE);
       
    }
}
