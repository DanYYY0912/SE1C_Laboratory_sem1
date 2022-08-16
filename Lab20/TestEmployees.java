/***********************************************************************
*                                                                      *
*      "Employees"                                                     *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 24-11-2020                                            *
* @Program     : Lab20XEx4                                             *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      24/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class TestEmployees {
    public static void main(String[] args){
        
        printHeader();
        
        Employee Sam = new Employee("Sam",111,30000);
        PartTimer Ray = new PartTimer("Ray",222,30,300);
        NewPartTimer June = new NewPartTimer("June",333,40,100,0.05);
        NewPartTimer May = new NewPartTimer("May",444,100,100,0.05);
        
        System.out.println(Sam);
        System.out.println(Ray);
        System.out.println(June);
        System.out.println(May);
        
        printFooter();
    }
    
    private static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\=========////////////");
        System.out.println("************Employees************");
        System.out.println("////////////=========\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    private static void printFooter() {
        System.out.println("\nThank you for using this <Employees>.");
        System.out.println("The Program has terminated normally.\n");

    }
}
