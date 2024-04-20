
//import scanner class for getting user input
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // create a new instance of the Scanner class and pass System.in in the
        // constructor
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to check if a number is prime or not :\nEnter a number: ");
        int num = scanner.nextInt();
        int count = 0; // variables for counting factors of num

        // checking if the number is prime or not
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            // a prime numnber has only 2 factors, itself and 1;
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
