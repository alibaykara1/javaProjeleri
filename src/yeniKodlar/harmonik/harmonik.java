//Java ile girilen sayının harmonik serisini bulan program yazacağız.
package yeniKodlar.harmonik;
import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner (System.in);
        System.out.print("Bir sayı giriniz :");
        n = input.nextInt();

        double result = 0;
        for(double i=1 ; i<=n ;i++){
            result += 1/i;
        }

        System.out.println( result );


    }
}
