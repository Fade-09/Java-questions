import java.util.*;
public class LeftNum {
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter your lucky digit for the pattern : ");
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
