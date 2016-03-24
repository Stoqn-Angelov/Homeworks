
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        int m = Integer.parseInt(input.next());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
            list.add(i);
        }

        Random rnd = new Random();

        int count = list.size();

        while (count > 0) {
            int randomIndex = rnd.nextInt(count);
            System.out.format("%d ", list.remove(randomIndex));
            count--;
        }
}
}
