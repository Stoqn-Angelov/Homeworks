import java.util.Scanner;
public class GetAverage {
    public static void main(String[] args) {


            Scanner number1 = new Scanner(System.in);
        System.out.print(" Enter a= ");
            double furstNumber = number1.nextDouble();
            Scanner number2 = new Scanner(System.in);
        System.out.print(" Enter b= ");
             double secondNumber = number2.nextDouble();
            Scanner number3 = new Scanner(System.in);
        System.out.print(" Enter c= ");
            double turdNumber = number3.nextDouble();

        double average = average(furstNumber,secondNumber,turdNumber);
        System.out.printf("Average is: %.2f",average);


    }
    private static Double average (double firstNunber,double secondNumber,double turdNumber){
        double average =0;
        average = (firstNunber + secondNumber + turdNumber)/3;

        return average;
    }
}
