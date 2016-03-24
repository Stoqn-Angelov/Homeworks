//Write a program that enters the sides of a rectangle (two integers a and b) and calculates and prints the rectangle's area.
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
         Scanner size = new Scanner(System.in);
        System.out.print("Enter a= ");
        int sizeA = size.nextInt();
        System.out.print("Enter b= ");
        int sizeB = size.nextInt();

        int area = CalculateArea(sizeA,sizeB);
        System.out.print("The area of the rectangle is: ");
        System.out.print(area);
    }
    private static Integer CalculateArea ( int sizeA, int sizeB){
        int area = 0;
        area = sizeA * sizeB;
        return area;
    }
}
