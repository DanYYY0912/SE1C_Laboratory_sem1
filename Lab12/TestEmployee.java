/*******************************************************************************
*                                                                              *
*      "Constructors"                                                          *
*                                                                              *
* @Name        : YUEN YIU YEUNG                                                *
* @StudentID   : 200171873                                                     *
* @Class       : IT114105/1C                                                   *
* @Date        : 08-11-2020                                                    *
* @Program     : Lab12Ex1                                                      *
* @Description : Add constructor and two methods to run the following program  *
* @Input       : AutoRun(NoNeed)                                               *
* @Output      : AutoRun(NoNeed)                                               *
* @History     :                                                               *
*      08/11/2020    new today                                                 *
*                                                                              *
********************************************************************************/
public class TestEmployee {
    public static void main(String [] args) {
        
        // (a)
        Employee emp1 = new Employee("Chan Tai Man", 12000);
        Employee emp2 = new Employee("Tam Ping Shing", 13500);
        
        printHeader();
        
        // Report result
        System.out.println("(b)\nEmployee 1: name = "+emp1.getName() +" salary = " +
                           emp1.getSalary());
        System.out.println("Employee 2: name = "+emp2.getName() +" salary = " +
                           emp2.getSalary());
                           
        System.out.print("(c)\nEmployee 1");
        emp1.displayDetails();
        System.out.print("Employee 2");
        emp2.displayDetails();
        emp1.raiseSalary(1.05);
        emp2.raiseSalary(1.1);                  
        
        emp1.raiseSalary(0.05);
        emp2.raiseSalary(0.1);
        System.out.print("(d)\nEmployee 1");
        emp1.displayDetails();
        System.out.print("Employee 2");
        emp2.displayDetails();                   
                        
        printFooter();
        
    }
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\===========////////////");
        System.out.println("************Constructor************");
        System.out.println("////////////===========\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void printFooter() {
        System.out.println("\nThank you for using this <Constructor>.");
        System.out.println("The Program has terminated normally.\n");

    }
} 
