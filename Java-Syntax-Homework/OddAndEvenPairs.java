//You are given an array of integers as a single line, separated by a space.
// Write a program that checks consecutive pairs and prints if both are odd/even or not.
// Note that the array length should also be an even number
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = input.nextLine().split(" ");

        if (array.length %2 != 0) {
            System.out.print("Invalid length");
        }else {
            for (int i = 0; i < array.length; i+=2) {
                int firstNumber = Integer.parseInt(array[i]);
                int secondNumber = Integer.parseInt(array[i+1]);

                  String str = "different";
                if (firstNumber % 2 ==0 && secondNumber % 2 ==0){
                    str = "both are even";
                } else if (firstNumber %2 != 0 && secondNumber %2 != 0){
                    str = "both are odd";
                }
                System.out.printf("%d, %d -> %s",firstNumber,secondNumber,str);
                System.out.println();
            }
        }
        
    }
}
