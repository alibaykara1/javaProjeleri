// girilen sayılardan hangisinin minimum ve hangisinin maksimum olduğunu bulan programı yazınız

package yeniKodlar.minvemax;

import java.util.Scanner;

public class minvemax {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        int n = inp.nextInt();

        System.out.print("Bir sayı giriniz : ");
        int girdi = inp.nextInt();

        int max = girdi, min = girdi;

        while (n-1 > 0){
            System.out.print("Bir sayı giriniz : ");
            int sayi = inp.nextInt();
            if (sayi < min){
                min = sayi;
            }
            if (sayi > max){
                max = sayi;
            }
            n--;
        }

        System.out.println("Max sayı : "+max);
        System.out.println("Min sayi : "+min);

    }
}
