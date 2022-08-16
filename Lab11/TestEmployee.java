/***********************************************************************
*                                                                      *
*      "ObjectsAndClasses"                                             *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 05-11-2020                                            *
* @Program     : Lab11Ex1                                              *
* @Description : Process the following program with creating object    *
*                instances from class Employee                         *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      02/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class TestEmployee {
    public static void main(String [] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        int oldSalary;
        
        printHeader();
        
        // Part 1-2 here
        emp1.setName("Chan Tai Man");
        emp1.setSalary(12000);
        emp2.setName("Tam Ping Shing");
        emp2.setSalary(13500);
        
        // Part 3 below
        System.out.println("Before-");
        System.out.println("Employee 1: name="+emp1.getName() +
                           " salary=" + emp1.getSalary());
        System.out.println("Employee 2: name="+emp2.getName() +
                           " salary=" + emp2.getSalary());
                           
        // Part 4-5 here
        emp1.setSalary((int)(emp1.getSalary() * (1.1)));
        emp2.setSalary((int)(emp2.getSalary() * (1+0.05)));
        System.out.println("After-");
        System.out.println("Employee 1: name="+emp1.getName() +
                           " salary=" + emp1.getSalary());
        System.out.println("Employee 2: name="+emp2.getName() +
                           " salary=" + emp2.getSalary());
                           
        printFooter();
    }
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\=================////////////");
        System.out.println("************ObjectsAndClasses************");
        System.out.println("////////////=================\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void printFooter() {
        System.out.println("\nThank you for using this <ObjectsAndClasses>.");
        System.out.println("The Program has terminated normally.\n");

    }
} 
