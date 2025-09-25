//Print alpha triangle pattern //
import java.util.Scanner;
public class AlphaTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            char ch='E';
            for (int j= 1; j<=i;j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println(" ");

        }
    }
}