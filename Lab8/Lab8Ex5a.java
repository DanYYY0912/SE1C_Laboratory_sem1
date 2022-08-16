
/**********************************************************************************************
*                                                                                             *
*      "FindPrime"                                                                            *
*                                                                                             *
* @Name        : YUEN YIU YEUNG                                                               *
* @StudentID   : 200171873                                                                    *
* @Class       : IT114105/1C                                                                  *
* @Date        : 20-10-2020                                                                   *
* @Program     : Lab8Ex5a                                                                     *
* @Description : To ensure the inner-loop has been executed 2415 times                        *
* @Input       : No Need(AutoRun)                                                             *
* @Output      : No Need(AutoRun)                                                             *
* @History     :                                                                              *
*      20/10/2020    new today                                                                *
*                                                                                             *
***********************************************************************************************/
public class Lab8Ex5a
{
   public static void main(String [ ] args) {
        int count = 1;
        System.out.print(2); // 2 is the first prime number
        int num = 2;
        int loopTimes = 0;
        while (count < 20) {
            num++; // try next number
            boolean isPrime=true;
            for (int i = 2; i < num; i++) {
                if (num%i == 0) // divisible by i
                    isPrime = false; // not a prime
                    loopTimes = loopTimes + 1;
                }
                if (isPrime) {
                    count++; // one more prime is found
                    System.out.print(", " + num);
                }
        }
        System.out.println("\nDone");
        System.out.print("Total calculation = " + loopTimes);
    }
}
