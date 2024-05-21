import java.util.*;
public class Floyds_Triangle {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        int n = scn.nextInt();
        int m = 1;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}
