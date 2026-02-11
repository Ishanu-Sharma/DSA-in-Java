import java.util.Scanner;
public class Pattern12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int star = x-1;
        int space = 1;
        for(int row=1; row<=((2*x)-1); row++){
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
            if(row<x){
                star --;
                space +=2;
            }
            else{
                star ++;
                space-=2;
            }
        }
    }
}