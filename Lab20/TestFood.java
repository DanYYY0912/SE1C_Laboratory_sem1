/***********************************************************************
*                                                                      *
*      "Food"                                                          *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 24-11-2020                                            *
* @Program     : Lab20XEx3                                             *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      24/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class TestFood {
    public static void main(String [] args) {
        
        printHeader();
        
        Food f = new Food("Rice", 3);
        Drink d = new Drink("Pepsi", 7, 250);
        Coffee c = new Coffee("Cappuccino", 13, 200, true);

        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        
        printFooter();
    }
    
    private static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\====////////////");
        System.out.println("************Food************");
        System.out.println("////////////====\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    private static void printFooter() {
        System.out.println("\nThank you for using this <Food>.");
        System.out.println("The Program has terminated normally.\n");

    }
}
