import java.util.Scanner;
public class HwPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int row = sc.nextInt();
        for(int i=row;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int space=1;space<=2*(row-i);space++){
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
