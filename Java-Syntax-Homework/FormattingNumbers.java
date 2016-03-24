//Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500),
// a floating-point b and a floating-point c and prints them in 4 virtual columns on the console.
// Each column should have a width of 10 characters. The number a should be printed in hexadecimal,
// left aligned; then the number a should be printed in binary form, padded with zeroes,
// then the number b should be printed with 2 digits after the decimal point, right aligned;
// the number c should be printed with 3 digits after the decimal point, left aligned.
import java.util.Scanner;
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a= ");
        int a = input.nextInt();
        if ( a >= 500){

            System.out.println("Enter another 0 ≤ a ≤ 500");
            System.out.print("Enter a= ");
             a = input.nextInt();

        }

        System.out.print("Enter b= ");
        double b = input.nextDouble();
        System.out.print("Enter c= ");
        double c = input.nextDouble();

        String aInHex = Integer.toHexString(a).toUpperCase();
        String aInBinn = Integer.toBinaryString(a);
        System.out.println();
        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|",aInHex,
                Integer.parseInt(aInBinn), b, c);

    }

}

