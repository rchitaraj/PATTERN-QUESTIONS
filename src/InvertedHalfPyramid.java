//Print Inverted-Half pyramid using numbers//
import java.util.Scanner;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int row = sc.nextInt();
        System.out.println(" Enter the character");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
