//Print diamond star pattern //
import java.util.Scanner;
public class DiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int row = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= (row - i); space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + temp; j++) {
                if (temp < row) ;
                System.out.print("* ");
            }
            temp++;
            System.out.println(" ");
        }
        int x = 0;
        int y = row;
        for (int i = 1; i <= row; i++) {
            for (int space = 0; space < x; space++) {
                if (x < row) {
                    System.out.print("  ");
                }
            }
            x++;
            for (int j = 1; j <= (y + (row - i)); j++) {
                if (y <= 1) {
                }
                System.out.print("* ");
            }
            y--;
            System.out.println(" ");
        }
    }
}




