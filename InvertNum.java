import java.util.*;
public class InvertNum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the lucky number you want : ");
        int n = scn.nextInt();
        for (int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    
}
