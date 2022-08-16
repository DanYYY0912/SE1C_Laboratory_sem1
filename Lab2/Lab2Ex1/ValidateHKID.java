/***********************************************************************************************************
*                                                                                                          *
*    Filename:    ValidateHKID.java                                                                        *
*    Programmer:  <YUEN YIU YEUNG>                                                                         *
*    Description: Determine the check digit of HKID numbers.                                               *
*                                                                                                          *
************************************************************************************************************/

import java.util.*;

public class ValidateHKID{

    public static void main(String[] args)
    {

        // Create a Scanner object for console input
           Scanner kb=new Scanner(System.in);

        // Declare variables
           char[] letter;
           int sum; 
           int code;

        // Output program message
           header();

        System.out.print("? ");
        String str=kb.next();
        letter    = str.toCharArray();
        letter[0] = Character.toUpperCase(letter[0]);

        // Processing - compute the weighted sum for the check digit
           sum =       ( (int)letter[0] -64 )*8;
           sum = sum + ( (int)letter[1] -48 )*7;
           sum = sum + ( (int)letter[2] -48 )*6;
           sum = sum + ( (int)letter[3] -48 )*5;
           sum = sum + ( (int)letter[4] -48 )*4;
           sum = sum + ( (int)letter[5] -48 )*3;
           sum = sum + ( (int)letter[6] -48 )*2;
           code = 11 - (sum % 11);

        // Output result
           System.out.print("The HKID is: " + letter[0] + 
                             str.substring(1,7));

           if(code == 11)
           {
               System.out.println("(0)");
           }
               else if ( code == 10 )
               {
                   System.out.println("(A)");
               }
                   else 
                   {
                       System.out.println("(" + code + ")");
                   }

        // Report program completely done 
           footer();
    }

    public static void header()
    {
        System.out.println("Program written by Danny YUEN");
        System.out.println("=======================================================");
        System.out.println("This program is used to determine the HKID check digit");
    }

    public static void footer()
    {
        System.out.println("The purpose of the program is to generate the HKID check digit.");
    }
}