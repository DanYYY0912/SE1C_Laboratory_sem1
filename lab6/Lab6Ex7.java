/**********************************************************************************************
*                                                                                             *
*      ParkingFee                                                                             *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 01-10-2020                                                                   *
* @Program     : Lab6Ex7                                                                      *
* @Description : Calculate the parking fee                                                    *
* @Input       : NumberOfVehicleType, NumberOfHours                                           *
* @Output      : ParkingFee                                                                   *
* @History     :                                                                              *
*      01/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
import java.util.Scanner;
public class Lab6Ex7
{
    public static void main(String[] args) {
        
        // Variable dictionary
        Scanner kb = new Scanner (System.in);
        int numOftype;                            // Corresponding vehicle type
        int numOfhrs;                             // Number of parking hours
        int PFee;                                 // Parking fee
    
        // Prompt user to input and read data from keyboard
        System.out.print("Vehicle Type [1=private, 2=bus, 3=truck]? ");
        numOftype = kb.nextInt();
    
        // Calculating parking fee
        if (numOftype == 1){
            System.out.print("Number of hours? ");
            numOfhrs = kb.nextInt();
            PFee = numOfhrs * 15;
            System.out.println("Parking fee = " + PFee);
        }else if (numOftype == 2){
              System.out.print("Number of hours? ");
              numOfhrs = kb.nextInt();
              PFee = numOfhrs * 35;
              System.out.println("Parking fee = " + PFee);  
        }else if (numOftype == 3){
              System.out.print("Number of hours? ");
              numOfhrs = kb.nextInt();
              PFee = numOfhrs * 50;
              System.out.println("Parking fee = " + PFee);
        }
    }
}    
    
