import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a%b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        System.out.println(b);
        sc.close();
        }
    }

