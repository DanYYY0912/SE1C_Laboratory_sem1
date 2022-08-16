/**********************************************************************************************
*                                                                                             *
*      "CheckPrime"                                                                           *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 29-10-2020                                                                   *
* @Program     : Lab9Ex8                                                                      *
* @Description : By using method isPrime() to check whether a number is prime                 *
* @Input       : An integer                                                                   *
* @Output      :                                                                              *
* @History     :                                                                              *
*      29/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab9Ex8
{
    public static void main(String [] args) {
        
        printHeader();
        
        // Variable Dictionary
        Scanner kb = new Scanner(System.in);
        int num;
        
        System.out.print("? ");
        num = kb.nextInt();
        isPrime(num);

        printFooter();
        
    }
    
    public static void isPrime(int num) {
        boolean isPrime = true;
        
        for (int i = 2; i < num; i++) {
            if (num%2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.print(num + " is a prime number");
        else
            System.out.print(num + " is not a prime number");
    }
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\==========////////////");
        System.out.println("************CheckPrime************");
        System.out.println("////////////==========\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void printFooter() {
        System.out.println("\nThank you for using this <programName>.");
        System.out.println("The Program has terminated normally.\n");
    }
}
