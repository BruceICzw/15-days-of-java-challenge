
//import scanner class for getting user input
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // create a new instance of the Scanner class and pass System.in in the
        // constructor
        Scanner scanner = new Scanner(System.in);
        int num, max = 0, min = 0;
        int[] numbers = new int[5];
        System.out.println("Program to find the maximum and minimum of numbers given\n");
        System.out.println("Enter the numbers and press Enter:");
        for (int i = 0; i < 5; i++) {
            min = numbers[0];
            num = scanner.nextInt();
            numbers[i] = num;
            if (numbers[i] > min) {
                max = numbers[i];
            } else {
                min = numbers[i];
            }

        }
        System.out.println(max + " is the maximum value and " + min + " is the minimum");

    }
}
