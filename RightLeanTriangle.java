import java.util.*;
public class RightLeanTriangle {
    public static void main (String[] argss){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter the height of the triangle : ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
