import java.util.Scanner;
public class BoundaryPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i<=x; i++){
            for(int j=1; j<=x; j++){
                if((i==1 || j==1) || (j==x || i==x)){
                System.out.print("* ");
            }
            else{
            System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}