//Print a right-angled number pyramid//
import java.util.Scanner;
public class RightAngledNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int row = sc.nextInt();
        System.out.println(" Enter the character");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
