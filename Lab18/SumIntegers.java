/***********************************************************************
*                                                                      *
*      "SumIntegers"                                                   *
*                                                                      *
* @Name        : YUEN YIU YEUNG                                        *
* @StudentID   : 200171873                                             *
* @Class       : IT114105/1C                                           *
* @Date        : 21-11-2020                                            *
* @Program     : Lab18XEx1(c)                                          *
* @Description : Sum up anarbitrary number of integers passed as       *
*                command line arguments                                *
* @Input       : Individual number or no input                         *
* @Output      : Calculate the sum of those number except no enter     *
*                number for printing No input                          *
* @History     :                                                       *
*      21/11/2020    new today                                         *
*                                                                      *
************************************************************************/
public class SumIntegers{
    public static void main(String[] args){
        
        printHeader();
        
        int total = 0;
        if(args.length == 0)
            System.out.println("No input!");
        else{
            for(int i=0;i<args.length;i++){
                total += Integer.parseInt(args[i]);
                System.out.print(args[i] + ((i==args.length-1)?"":" + "));
            }
            System.out.println(" = " + total);
        }
        
        printFooter();
    }
    
    private static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\===========////////////");
        System.out.println("************SumIntegers************");
        System.out.println("////////////===========\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    private static void printFooter() {
        System.out.println("\nThank you for using this <SumIntegers>.");
        System.out.println("The Program has terminated normally.\n");

    }
}
