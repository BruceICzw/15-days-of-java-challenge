
//imort scanner class for getting user input
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int length, width, area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to Calculate area of a rectangle:\nLength: ");
        length = scanner.nextInt();
        System.out.println("\nWidth: ");
        width = scanner.nextInt();

        area = length * width;

        System.out.println("The area of the rectangle with dimensions " + length + " x " + width + " is " + area);

    }
}
