import java.util.Scanner;
public class PrintCharacterTriangle {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.print("Enter how many row you want to have: ");
        int number = input.nextInt();

         upperRows(number);
        lowerRows(number);

    }
    private static void lowerRows (int number){

        for (int i = number - 1 ; i > 0 ; i--) {
            howManyRows(i);
        }
    }
    private static void upperRows (int number) {
        for (int i = 1; i <= number; i++) {
            howManyRows(i);
        }
    }
    private static void howManyRows(int i){
        for (char c = 'a'; c < 'a' + i ; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
