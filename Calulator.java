import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation (Power)");
            System.out.println("7. Celsius to Fahrenheit");
            System.out.println("8. Fahrenheit to Celsius");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;
                }
                case 2: {
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                    break;
                }
                case 3: {
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                    break;
                }
                case 4: {
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Error: Division by zero!");
                    break;
                }
                case 5: {
                    System.out.print("Enter a number: ");
                    double a = sc.nextDouble();
                    System.out.println("Square Root = " + Math.sqrt(a));
                    break;
                }
                case 6: {
                    System.out.print("Enter base and exponent: ");
                    double base = sc.nextDouble(), exp = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(base, exp));
                    break;
                }
                case 7: {
                    System.out.print("Enter Celsius: ");
                    double c = sc.nextDouble();
                    double f = (c * 9 / 5) + 32;
                    System.out.println("Fahrenheit = " + f);
                    break;
                }
                case 8: {
                    System.out.print("Enter Fahrenheit: ");
                    double f = sc.nextDouble();
                    double c = (f - 32) * 5 / 9;
                    System.out.println("Celsius = " + c);
                    break;
                }
                case 9:
                    System.out.println("Exiting Calculator...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 9);

        sc.close();
    }
}



