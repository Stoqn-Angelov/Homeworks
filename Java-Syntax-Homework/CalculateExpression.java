//Write a program that reads three floating point numbers from the console and calculates their result with the following formulae:
//((a2 + b2) / (a2 – b2))(a + b + c) / √c             (a2 + b2 - c3)(a – b)
//Then calculate the difference between the average of the three numbers and the average of the two formulae. Average (a, b, c)
// –Average (f1, f2)

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a= ");
        double a = input.nextDouble();
        System.out.print("Enter b= ");
        double b = input.nextDouble();
        System.out.print("Enter c= ");
        double c = input.nextDouble();
        double firstFormulae = FirstFormulae(a,b,c);
        double secondFormulae = SecondFormulae(a,b,c);
        double difference = Difference(a,b,c);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",firstFormulae,secondFormulae,difference);

    }

    private static Double FirstFormulae (double a, double b, double c){
        double f1=0;
        f1= Math.pow((Math.pow(a,2)+ Math.pow(b,2))/(Math.pow(a,2)- Math.pow(b,2)),((a+b+c)/Math.sqrt(c)));
        return f1;
    }
    private static Double SecondFormulae (double a, double b, double c){
        double f2= 0;
        f2 = Math.pow((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2)),(a-b));

        return f2;
    }
    private static Double Difference (double a, double b, double c){
        double f3 = 0;
         f3 = Math.abs(((a+b+c)/3) - ((FirstFormulae(a,b,c)+SecondFormulae(a,b,c))/2));
        return f3;

    }
}
