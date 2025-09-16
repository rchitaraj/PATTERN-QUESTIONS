//Print floyd's trainagle //
import java.util.Scanner;
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int row = sc.nextInt();
        int temp=1;
        System.out.println(" Enter the character");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println(" ");
        }
    }
}
