/***********************************************************************
*                                                                      *
*      "ObjectsAndClasses2"                                            *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 07-11-2020                                            *
* @Program     : Lab11Ex2                                              *
* @Description : Process the following program with creating object    *
*                instances from class Student                          *
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      07/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class TestStudent {
    public static void main(String [] args) {
        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();
        
        printHeader();
        
        // setup Student
        stud1.setName("Cheung Siu Ming");
        stud1.setid(310567);
        stud1.setScore(87.1);
        
        stud2.setName("Ng Wai Man");
        stud2.setid(451267);
        stud2.setScore(77.5);
        
        stud3.setName("Wong Siu Kai");
        stud3.setid(789014);
        stud3.setScore(83.4);
        
        // Report result
        System.out.println("Student1 : name ="+stud1.getName()+"id ="+
                           stud1.getid()+" score="+stud1.getScore());
        System.out.println("Student2 : name ="+stud2.getName()+"id ="+
                           stud2.getid()+" score="+stud2.getScore());
        System.out.println("Student3 : name ="+stud3.getName()+"id ="+
                           stud3.getid()+" score="+stud3.getScore());
                           
        System.out.println("\nAverage Score = "+(double)((stud1.getScore()
                           +stud2.getScore()+stud3.getScore())/3));
                           
        printFooter();
    }
        
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\==================////////////");
        System.out.println("************ObjectsAndClasses2************");
        System.out.println("////////////==================\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void printFooter() {
        System.out.println("\nThank you for using this <ObjectsAndClasses2>.");
        System.out.println("The Program has terminated normally.\n");

    }
}
