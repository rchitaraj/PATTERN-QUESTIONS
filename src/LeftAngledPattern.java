//Print a left angled triangle of stars//
import java.util.Scanner;
public class LeftAngledPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <=(row-i); space++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
