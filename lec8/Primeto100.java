import java.util.Scanner;
public class Primeto100{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt(); 
        for(int i =2; i<=n;i++){
            int Prime = 1;
            for(int j = 2; j<i; j++){
            if(i%j==0){
                Prime = 0;
                break;
            }
        }
        if(Prime == 1){
            System.out.print(i + " ");
        }
        }
        }
    }
