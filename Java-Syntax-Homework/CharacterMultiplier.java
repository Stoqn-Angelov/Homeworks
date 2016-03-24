//Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
// (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum).
// Then continue with the next two characters. If one of the strings is longer than the other,
// add the remaining character codes to the total sum without multiplication.
import java.util.Scanner;
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] str = input.nextLine().split(" ");

        System.out.println(Multiplier(str[0], str[1]));
    }

    private static int Multiplier(String str1, String str2) {

        int longerLength = Math.max(str1.length(), str2.length());

        int sum = 0;
        for (int i = 0; i < longerLength; i++) {
            int code1 = 1;
            int code2 = 1;
            if (i < str1.length()) {
                code1 = str1.charAt(i);
            }
            if (i < str2.length()) {
               code2 = str2.charAt(i);
            }
            sum += code1 * code2;
        }

        return sum;
    }
}
