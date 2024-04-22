
//import scanner class for getting user input
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    int num = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Program to calculate the factorial of a number: \n");
    System.out.println("Enter a number: ");

    num = scanner.nextInt();
    int result = factCalc(num);
    System.out.println("The factorial of " + num + " is " + result + "\n");

    scanner.close(); // Close the Scanner object

  }

  public static int factCalc(int number) {
    int res = 1;

    for (int i = 1; i <= number; i++) {
      res = res * i;
    }
    return res;

  }
}
