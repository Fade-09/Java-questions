import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        System.out.println("Enter 2 integral values to perform an operation.");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Enter the desired operator (+, -, *, / or %).");
        String c = scan.next();
        int d = 0;
        switch (c) {
            case "+":
                d = a + b;
                System.out.println("The result is "+ d);
                break;
            case "-":
                if (a > b) {
                    d = a - b;
                    System.out.println("The result is "+ d);
                } else {
                    d = b - a;
                    System.out.println("The result is "+ d);
                }
                break;
            case "*":
                d = a * b;
                System.out.println("The result is "+ d);
                break;
            case "/":
                if (a > b) {
                    d = a / b;
                    System.out.println("The result is "+ d);
                } else {
                    d = b / a;
                    System.out.println("The result is "+ d);
                }
                break;
                case "%":
                if (a > b) {
                    d = a % b;
                    System.out.println("The result is "+ d);
                } else {
                    d = b % a;
                    System.out.println("The result is "+ d);
                }
                break;
            default:
                System.out.println("Invalid entry, please enter a valid operator.");
        }
    }
}