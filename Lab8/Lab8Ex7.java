
/**********************************************************************************************
*                                                                                             *
*      "Multiplication Table"                                                                 *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 20-10-2020                                                                   *
* @Program     : Lab8Ex7                                                                      *
* @Description : Generate a Multiplication Tab                                                *
* @Input       : No need(AutoRun)                                                             *
* @Output      : Multiplication Table                                                         *
* @History     :                                                                              *
*      20/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
public class Lab8Ex7
{
    public static void main(String args[]) {
        
        // Variable Dictionary
        int MTable[][] = new int [10][10];
        
        // Print Header format
        System.out.print("        ");
        for (int num = 0; num < 10; num++) {
            if (num == 9)
                System.out.println(num);
            else
            System.out.print(num + "  ");
        }
        System.out.println("     " + "+------------------------------");
        
        // Print Multiplication Table
        for (int xAs = 0; xAs < 10; xAs++) {
            System.out.print("   ");
            if (xAs == 9)
                System.out.print(xAs + "|  ");
            else
            System.out.print(xAs + "|  ");
            for (int yAs = 0; yAs < MTable.length; yAs++) {
                if (yAs == 0) {                             // Printing number due to the specific condition
                    MTable[xAs][yAs] = xAs - xAs;
                } else {
                    MTable[xAs][yAs] = MTable[xAs][yAs-1] + xAs;
                }
                if(MTable[xAs][yAs] < 10) {
                    System.out.print(" " + MTable[xAs][yAs] + " ");
                } else {
                    System.out.print(MTable[xAs][yAs] + " ");
                }
            }
            System.out.println();
        }
        
        // Report result
        System.out.println("\nThank you for printing Multiplication Table.");
    }
}
