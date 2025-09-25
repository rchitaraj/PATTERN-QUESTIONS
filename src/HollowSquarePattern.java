//Print hollow square pattern //
import java.util.Scanner;
public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i = i + 2) {
            System.out.println();
            for (int j = 1; j <= row; j++) {
                if (i == 1 || j == 1 || i == row || j == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
