import java.util.Scanner;
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Write the number you want to convert to Ghetto numeral system: ");
        int number = inputNumber.nextInt();

        String convertedNumber = convertingNumberToGhetto(number);
        System.out.println(convertedNumber);

    }
    private static String convertingNumberToGhetto(Integer number){

        String convurtNumber = number.toString();
        StringBuilder gettoNumber = new StringBuilder();
        for (int i = 0; i <convurtNumber.length() ; i++) {

            gettoNumber.append(convertDigitInGetto(convurtNumber.charAt(i)));
        }

        return gettoNumber.toString();
    }
    private static String convertDigitInGetto (char digit){
        String gettoDigit =" ";
        switch (digit){
            case '0' :  gettoDigit = "Gee"; break;
            case '1' :  gettoDigit = "Bro"; break;
            case '2' :  gettoDigit = "Zuz"; break;
            case '3' :  gettoDigit = "Ma";  break;
            case '4' :  gettoDigit = "Duh"; break;
            case '5' :  gettoDigit = "Yo";  break;
            case '6' :  gettoDigit = "Dis"; break;
            case '7' :  gettoDigit = "Hood"; break;
            case '8' :  gettoDigit = "Jam";  break;
            case '9' :  gettoDigit = "Mack"; break;
                default:System.out.println("You cannot convert this number even in ghetto numeral.");
                    break;
        }
        return gettoDigit;
    }
}
