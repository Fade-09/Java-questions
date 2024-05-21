import java.util.*;
public class InvertTriangle {
    public static void main (String [] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the height of the inverted triangle : ");
        int n = scn.nextInt();
        for(int i = n; i >= 1; i-- ){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
