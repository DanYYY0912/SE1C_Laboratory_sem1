/**********************************************************************************************
*                                                                                             *
*      "LDLC"                                                                                 *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : DD-MM-YYYY                                                                   *
* @Program     : "Lab2Ex2"                                                                    *
* @Description : Computing the formula of LDLC                                                *
* @Input       : "Total Cholesterol, HDL Choesterol, Triglyceride"                            *
* @Output      : "LDLC"                                                                       *
* @History     :                                                                              *
*      24/09/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/

import java.util.Scanner;

public class LDLC{

    public static void main(String[] args)
    {

        // Create a Scanner object for console input
           Scanner input = new Scanner(System.in);

        // Declare variables
           int    TC;                           // Total Cholesterol
           int    HDLC;                         // HDL Cholesterol
           int    TG;                           // Triglyceride
           double LDLC;                         // LDL cholesterol

        System.out.print("Enter (TC) : ");
        TC   = input.nextInt();                 // input TC
        System.out.print("Enter (HDLC) : ");
        HDLC = input.nextInt();                 // input HDLC
        System.out.print("Enter (TG) : ");
        TG   = input.nextInt();                 // input TG

        // Processing - compute the formula of LDLC
        LDLC = TC - HDLC - (double) (TG) / 5;   // assignment statement

        // Output result
        System.out.println("(LDLC) = " + LDLC);
    }
}