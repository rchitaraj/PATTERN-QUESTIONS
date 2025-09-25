//Print alpha hill pattern //
import java.util.Scanner;
public class AlphaHillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int space = 1; space <= (row - i); space++) {
                System.out.print("  ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch--;
            ch--;
            for (int j = 1; j < i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println(" ");
        }
    }
}


