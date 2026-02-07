import java.util.Scanner;
public class Pattern9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int star = x;
        int space = 0;
        for(int row=1; row<=x; row++){
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            for(int i = 1; i<=space; i++){
                System.out.print("  ");
            }
            
            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            System.out.println();
            space+=2;
            star--;
        }
    }
}