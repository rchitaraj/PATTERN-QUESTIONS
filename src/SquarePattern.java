//Print a square of stars(5x5)
import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
