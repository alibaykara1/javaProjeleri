//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.


package yeniKodlar.ikikuvsayiyakadar;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {

        int n, count = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4'ün "+count+". kuvveti"+i);
            count++;
        }
        count =0;
        for(int i =1; i <= n ; i*=5){
            System.out.println("5'in "+count+". kuvveti"+i);
            count++;
        }


    }
}
