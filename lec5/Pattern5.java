import java.util.Scanner;
public class Pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int star = 1;
        int space = x-1;
        for(int row=1; row<=x; row++){
            for(int i = 1; i<=space; i++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
            star = star+2;
        }
    }
}