/***********************************************************************
*                                                                      *
*      "Objects and Methods"                                           *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 16-11-2020                                            *
* @Program     : Lab15XEx1                                             *
* @Description : By passing an object reference to a method to identify*
* @Input       : AutoRun                                               *
* @Output      : AutoPrint                                             *
* @History     :                                                       *
*      16/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class Distance {
    public static void main(String [] args) {
        
        printHeader();
        
        Point p1 = new Point(4, 5);
        Point p2 = new Point(11, 4);
        System.out.println("Distance = " + p1.distance(p2));
        
        printFooter();
    }
    
    private static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\=================////////////");
        System.out.println("************ObjectsAndMethods************");
        System.out.println("////////////=================\\\\\\\\\\\\\\\\\\\\\\\\\n");
    }

    private static void printFooter() {
        System.out.println("\nThank you for using this <ObjectsAndMethods>.");
        System.out.println("The Program has terminated normally.\n");

    }
} 
