//Write a program that takes an integer number and converts it to base-7
import java.util.Scanner;
public class ConvertDecimalToBase7 {
    public static void main(String[] args) {
         Scanner input   = new Scanner(System.in);
        System.out.println("Enter number that you want to convert in 7 base");
        System.out.print("number= ");
        int number = input.nextInt();
        System.out.print("Converted number is: ");

        System.out.print(Integer.toString(number,7));
    }
}
