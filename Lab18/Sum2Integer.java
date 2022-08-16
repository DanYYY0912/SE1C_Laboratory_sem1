/***********************************************************************
*                                                                      *
*      "Sum2Integers"                                                  *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 21-11-2020                                            *
* @Program     : Lab18XEx1(b)                                          *
* @Description : Checks whether the user has actually entered 2command *
*                line arguments. If not, issue the warning message     *
* @Input       : Individual number                                     *
* @Output      : Calculate the sum of two number or issue the warning  *
*                message and the usage of this program                 *
* @History     :                                                       *
*      21/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class Sum2Integer{
    public static void main(String[] args){
        
        printHeader();
        
        int total = 0;
        if(args.length < 2){
            System.out.println("Please ENTER 2 command line arguments");
            System.out.println("Usage: java Sum2Integers<num1><num2>");
        }else{
            total = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.println("The sum is " + total);
        }
        
        printFooter();
    }
    
    private static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\============////////////");
        System.out.println("************Sum2Integers************");
        System.out.println("////////////============\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    private static void printFooter() {
        System.out.println("\nThank you for using this <Sum2Integers>.");
        System.out.println("The Program has terminated normally.\n");

    }
}