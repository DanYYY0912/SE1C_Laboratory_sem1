/**********************************************************************************************
*                                                                                             *
*      ExamMark                                                                               *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 01-10-2020                                                                   *
* @Program     : Lab6Ex8                                                                      *
* @Description : Determine the grade obtained                                                 *
* @Input       : ExaminationMark                                                              *
* @Output      : Grade                                                                        *
* @History     :                                                                              *
*      01/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab6Ex8
{
    public static void main(String[] args) {
    
        // Variable dictionary
        Scanner kb = new Scanner(System.in);
        double ExamMark;
        
        
        // Prompt user to input and read data from keyboard
        System.out.print("Exam mark? ");
        ExamMark = kb.nextDouble();
        
        // Determine the grade
        if (ExamMark >= 0 && ExamMark <= 59)
            System.out.println("Grade = F");
        else if (ExamMark >= 60 && ExamMark <= 69)
            System.out.println("Grade = D");
        else if (ExamMark >= 70 && ExamMark <= 79)
            System.out.println("Grade = C");
        else if (ExamMark >= 80 && ExamMark <= 89)
            System.out.println("Grade = B");
        else 
            System.out.println("Grade = A");
            
    }
}
