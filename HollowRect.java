import java.util.Scanner;

public class HollowRect {
    public static void main (String [] args){
        System.out.println("Enter the dimensions of the hollow rectangle : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= m; j++){
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
