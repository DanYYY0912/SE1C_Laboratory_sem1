/***********************************************************************************
*                                                                                  *
*      "AccessSpecifiers"                                                          *
*                                                                                  *
* @Name        : YUEN YIU YEUNG                                                    *
* @StudentID   : 200171873                                                         *
* @Class       : IT114105/1C                                                       *
* @Date        : 12-11-2020                                                        *
* @Program     : Lab13XEx1                                                         *
* @Description : By calling object to class CurrencyConverter to exchange          *
*                between a foreign currency and US dollars                         *                                 *
* @Input       : AutoRun                                                           *
* @Output      : AutoPrint                                                         *
* @History     :                                                                   *
*      12/11/2020    new today                                                     *
*                                                                                  *
************************************************************************************/
public class TestCurrencyConverter
{
    public static void main(String[] args) {
        CurrencyConverter yenConverter = new CurrencyConverter(115.7, 0.0005);
        CurrencyConverter euroConverter = new CurrencyConverter(0.9927, 0.0003);
        
        printHeader();
        
        yenConverter.setLargeAmount(50000);
        euroConverter.setLargeAmount(50000);
        
        // Report result
        // yens to US
        System.out.println("\n1500000 yens = US$ " + yenConverter.toUSDollar(1500000) + 
                           "\nUS$ 2000 = " + yenConverter.fromUSDollar(2000)+ " yens");

        // Set exchangeRate of euro to 0.9881
        euroConverter.setExchangeRate(0.9881);
        
        //euros to US
        System.out.println("\n170000 euros = US$ " + euroConverter.toUSDollar(170000) + 
                           "\nUS$ 20000 = " + euroConverter.fromUSDollar(20000) + " euros");
                           
        printFooter();                   
    }
    
    public static void printHeader() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\================////////////");
        System.out.println("************AccessSpecifiers************");
        System.out.println("////////////================\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void printFooter() {
        System.out.println("\nThank you for using this <AccessSpecifiers>.");
        System.out.println("The Program has terminated normally.\n");

    }
}

