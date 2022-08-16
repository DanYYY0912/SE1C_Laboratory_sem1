
/**********************************************************************************************
*                                                                                             *
*      "OddEven"                                                                              *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 10-10-2020                                                                   *
* @Program     : Lab7Ex12                                                                     *
* @Description : Determining the numbers are odd or even                                      *
* @Input       : Values                                                                       *
* @Output      : Number of odd and even values                                                *
* @History     :                                                                              *
*      10/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab7Ex12
{
    public static void main(String[] args) {
        
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        int value;
        int odd = 0;
        int even = 0;
        
        // Processing for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Value? ");
            value = kb.nextInt();
            if (value % 2 == 0)
                even = even + 1;
            else
                odd = odd +1;
        }
        
        // Report result
        System.out.println("Number of odd values = " + odd);
        System.out.println("Number of even values = " + even);
        System.out.println("\nThank you for using this OddEven.");
    }
}
