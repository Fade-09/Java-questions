import java.util.Scanner;

public class rect {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the dimensions of the Rectangle : ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
