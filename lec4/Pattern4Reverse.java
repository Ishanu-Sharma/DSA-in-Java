import java.util.Scanner;
public class Pattern4Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int space = 0;
        int star = x;
        int row = 1;
        while(row<=x){
            int i = 1;
            while(i<=2*space)//or(i<=space) if space += 2;
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space++;//or space += 2;
            star--;
            row++;
        }
    }
}