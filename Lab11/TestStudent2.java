/***********************************************************************
*                                                                      *
*      "ObjectsAndClasses3"                                            *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 08-11-2020                                            *
* @Program     : Lab11Ex3                                              *
* @Description : Process the following program with creating object    *
*                instances from class AStudent                         *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      08/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class TestStudent2 {
    public static void main(String s[]) {
        AStudent stud1 = new AStudent();
        AStudent stud2 = new AStudent();
        
        printHeader();
        
        // setup Student
        stud1.setName("Chan Tai Man");
        stud1.setAge(19);
        
        stud2.setName("Ng Hing");
        stud2.setAge(-23);
        
        // Report result
        System.out.println("Student: name="+stud1.getName() +
                           ", age=" + stud1.getAge());
        System.out.println("Student: name="+stud2.getName() +
                           ", age=" + stud2.getAge());
                           
        printFooter();
    }
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\==================////////////");
        System.out.println("************ObjectsAndClasses3************");
        System.out.println("////////////==================\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void printFooter() {
        System.out.println("\nThank you for using this <ObjectsAndClasses3>.");
        System.out.println("The Program has terminated normally.\n");

    }
} 
