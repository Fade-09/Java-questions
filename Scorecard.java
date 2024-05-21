import java.util.*;

public class Scorecard {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int a;
        do {
            System.out.println("Enter the marks out of 100.");
            int marks = scn.nextInt();
            if (marks > 100) {
                System.out.println("Please enter a valid input.");
            }
            else if (marks >= 90) {
                System.out.println("This is Good.");
            }
            else if (89 >= marks && marks >= 60 ) {
                System.out.println("This is also Good.");
            }
            else {
                System.out.println("This is Good as well");
            }
            System.out.println("Enter '1' to input the marks of the subject again and '0' to stop : ");
            a = scn.nextInt();
        } while (a == 1);
    }
}
