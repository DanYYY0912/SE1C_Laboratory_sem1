/**********************************************************************************************
*                                                                                             *
*      "FibonacciSeries"                                                                      *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 29-10-2020                                                                   *
* @Program     : Lab9Ex7                                                                      *
* @Description : Using the Fibonacci Series to print the number of terms specified by the user*
* @Input       : An integer number                                                            *
* @Output      : Print the Fibonacci Series with the number of terms                          *
* @History     :                                                                              *
*      29/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab9Ex7
{
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("? ");
        int num = kb.nextInt();
        printFib(num); // call printFib() with num as argument

    }
    
    public static void printFib(int num) {
        int sum = 1;
        int value = 1;
        
        System.out.print(value);
        for (int i = 1; i < num; num--) {
            System.out.print(", ");
            System.out.print(sum);
            sum += value;
        }
    }
}
