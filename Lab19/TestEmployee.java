/***********************************************************************
*                                                                      *
*      "Employee"                                                      *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 24-11-2020                                            *
* @Program     : Lab19XEx1                                             *
* @Description : Inheriting from Employee class to FTEmployee          *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      24/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class TestEmployee {
    public static void main(String [] args) {
        Employee emp = new Employee("John", 31520);
        FTEmployee ftemp = new FTEmployee("Mary", 42680, 15000.5);
        
        printHeader();
        
        System.out.println(emp);
        System.out.println(ftemp);
        
        printFooter();
    }
    
    private static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\========////////////");
        System.out.println("************Employee************");
        System.out.println("////////////========\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    private static void printFooter() {
        System.out.println("\nThank you for using this <Employee>.");
        System.out.println("The Program has terminated normally.\n");

    }
}	

