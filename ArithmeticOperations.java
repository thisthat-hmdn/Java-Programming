import java.util.Scanner;            //this is used in order to scan the inputs

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);          // the scanning tool

        // Read two integers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculate sum, difference and product
        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        // Display results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        sc.close();
    }
}