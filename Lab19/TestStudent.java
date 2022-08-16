/***********************************************************************
*                                                                      *
*      "Student"                                                       *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 24-11-2020                                            *
* @Program     : Lab19XEx2                                             *
* @Description : Inheriting from Student class to OutstandingStudent   *
*                and override                                          *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      24/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class TestStudent {
    public static void main(String [] args) {
        
        printHeader();
        
        Student s1=new Student("Ben", 123, 2);
        System.out.println(s1);
        Student s2=new Student("John", 246, 6);
        System.out.println(s2);
        Student os1=new OutstandingStudent("Mary", 456, 3, "academic");
        System.out.println(os1);
        Student os2=new OutstandingStudent("Peter", 567, 7, "sports");
        System.out.println(os2);
        
        printFooter();
    }
    
    private static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\=======////////////");
        System.out.println("************Student************");
        System.out.println("////////////=======\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    private static void printFooter() {
        System.out.println("\nThank you for using this <Student>.");
        System.out.println("The Program has terminated normally.\n");

    }
}

