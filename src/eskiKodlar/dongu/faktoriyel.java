package dongu;
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        // n! = 1*2*3*4*5*...*n

        int n;
        int total=1;

        Scanner inp = new Scanner (System.in);
        System.out.print("Bir sayı giriniz :");
        n = inp.nextInt();

        for(int i=1 ;i<=n ;i++){
            total *=i;
        }
        System.out.println(n+"! :"+total);
    }
}
