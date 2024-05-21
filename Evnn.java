import java.util.*;
public class Evnn {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any integer to get all the even number until it : ");
        int a = scn.nextInt();
        for (int i = 0; i <= a; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("These are all the even numbers until the entered number.");
    }
}
