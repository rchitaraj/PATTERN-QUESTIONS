//Print half pyramid using alphabet //
import java.util.Scanner;
public class CharRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int row = sc.nextInt();
        System.out.println(" Enter the character");
        for (int i = 1; i <= row; i++) {
            char ch='A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println(" ");
        }
    }
}

