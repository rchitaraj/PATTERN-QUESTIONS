//Print half diamond star pattern //
import java.util.Scanner;
public class HalfDiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        int y=row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=(y-1); j++) {
                System.out.print("* ");
            }
            y--;
            System.out.println(" ");
        }
    }
}

