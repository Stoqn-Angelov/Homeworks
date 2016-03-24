import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Enter some number:");
        int number = inputNumber.nextInt();

        Integer sum = sumNumber(number);
        System.out.println(sum);
    }
    private static Integer sumNumber (int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {

            sum += i;
        }
        return sum;
    }
        
}
