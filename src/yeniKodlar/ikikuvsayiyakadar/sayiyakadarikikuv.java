//Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

package yeniKodlar.ikikuvsayiyakadar;

import java.util.Scanner;

public class sayiyakadarikikuv {
    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        n=inp.nextInt();

        for(int i=1 ;i<n ;i *= 2 ){
            System.out.println(i);
        }









    }
}
