//Print a symmetric void pattern//
import java.util.Scanner;
public class SymmetricVoidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int row = sc.nextInt();
        //upper half
        for (int i = row; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= 2 * (row - i); space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower half
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= 2 * (row - i); space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




