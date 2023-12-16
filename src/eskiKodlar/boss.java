// girilen bir sayının binary karşılığını hesaplama
import java.util.Scanner;

public class boss {
    public static void main (String[]args){

        int n, kalan ;
        String binary="";
        Scanner input = new Scanner ( System.in);
        System.out.print("Bir sayı giriniz :");
        n = input.nextInt();

        while(n!= 0){
            kalan =n % 2;
            binary = kalan + binary;
            n=n/2;
        }
        System.out.println("Binary karşılığı:"+binary
        );
    }
}
