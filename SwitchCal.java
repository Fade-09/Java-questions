import java.util.Scanner;

public class SwitchCal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first integer to perform operation : ");
        int a = scn.nextInt();
        System.out.println("Enter second integer to perform operation : ");
        int b = scn.nextInt();
        System.out.println("Enter an operator to perform operation.");
        String c = scn.next();
        switch (c) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            default:
            System.out.println("Please enter a valid operator.");
                break;
        }
        System.out.println("Hence, this is how we do it using switch case.");
    }
}