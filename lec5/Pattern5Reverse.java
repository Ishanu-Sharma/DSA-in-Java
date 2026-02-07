import java.util.Scanner;
public class Pattern5Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int star = (2*x)-1;
        int space = 0;
        for(int row=1; row<=x; row++){
            //spaces
            for(int i = 1; i<=space; i++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
            space++;
            star = star-2;
        }
    }
}