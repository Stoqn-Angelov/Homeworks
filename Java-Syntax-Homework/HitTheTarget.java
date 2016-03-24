//Write a program that takes as input an integer – the target – and outputs
// to the console all pairs of numbers between 1 and 20, which, if added or subtracted, result in the target.
import java.util.Scanner;
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = Integer.parseInt(input.next());
        for (int i = 0; i <=20; i++) {
            for (int j = 0; j <=20 ; j++) {
                if ( i + j == target){
                    System.out.printf("%d + %d = %d\n",i,j,target);
                }else {
                   if( i - j == target) {
                       System.out.printf("%d - %d = %d\n", i, j, target);

                   }
                }

            }
        }
    }

}
