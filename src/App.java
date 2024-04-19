
//import scanner class for getting user input
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //declaring variables
        int length, width, area;
        //create a new instance of the Scanner class and pass System.in in the constructor
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to Calculate area of a rectangle:\nLength: ");
        length = scanner.nextInt();
        System.out.println("\nWidth: ");
        width = scanner.nextInt();

        area = length * width;

        System.out.println("The area of the rectangle with dimensions " + length + " x " + width + " is " + area);

    }
}
