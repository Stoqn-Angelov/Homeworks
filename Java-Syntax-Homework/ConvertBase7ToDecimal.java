//Write a program that converts from a base-7 number to its decimal representation
import java.util.Scanner;
public class ConvertBase7ToDecimal {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        System.out.println("Enter 7 base number that you want to convert in decimal");
        System.out.print("number= ");
        String number = input.nextLine();
        System.out.print("Converted number is: ");

        try {
            Integer decimalNummber = Integer.valueOf(number,7);
            System.out.print("Converted number is: ");
            System.out.print(decimalNummber);
        }catch ( NumberFormatException ax){
            System.out.print("Invalid number");
        }
    }
}
