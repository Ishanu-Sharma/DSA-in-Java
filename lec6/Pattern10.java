import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int star = 1;
        for(int i = 1; i<=((2*x)-1); i++){
            for(int j = 1; j<=star; j++){
                System.out.print(" * ");
            }
            if(i<x){
                star ++;
            }
            else{
                star --;
            }
            System.out.println(" ");
        }
        sc.close();
    }
}