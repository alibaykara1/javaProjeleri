// girilen bir sayının basamak sayısını hesaplama

import java.util.Scanner;

public class bosKodlar{
    public static void main (String[]args){

        int n ,comp=0 ;

        Scanner input = new Scanner (System.in);
        System.out.print("Bir sayı giriniz :");
        n = input.nextInt();

        while(n!=0){
            n/=10; // n = n / 10
            comp++;
        }
        System.out.println("Basamak sayısı:"+comp);


    }
}