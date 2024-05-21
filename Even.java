import java.util.*;

public class Even {
    public static void main (String args[] ) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int a = 1; a < n; a++) {
            if (a%2 == 0) {
                System.out.println(a);
            }
        }
    }
}