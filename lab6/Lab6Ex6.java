/**********************************************************************************************
*                                                                                             *
*      DirectionOfNYC                                                                         *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 01-10-2020                                                                   *
* @Program     : Lab6Ex6                                                                      *
* @Description : Compute a right direction to user                                            *
* @Input       : StreetNumber                                                                 *
* @Output      : East-bound or West-bound                                                     *
* @History     :                                                                              *
*      01/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/

import java.util.Scanner;
public class Lab6Ex6
{
    public static void main(String[] args) {
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        int StreetNum;                                         // Number of user input
        
        // Prompt user to input and read data from keyboard
        System.out.print("Street number? ");
        StreetNum = kb.nextInt();                              // Input StreetNumber
        
        // Compute the right direction
        if (StreetNum % 2 == 0)                                // Compute either StreetNum is divisible or not
            System.out.println("East-bound");
        else
            System.out.println("West-bound");
        
    }
}
