//switch case kullanılarak hesap makinesi yapma
package yeniKodlar.Hesapmakinesi;

import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = input.nextInt();

        System.out.println("İşleminizi seçiniz :");
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama =" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma =" + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma =" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bölme =" + (n1 / n2));
                } else {
                    System.out.print("Bir sayı 0'a bölünemez !");
                }
                break;
            default:
                System.out.print("Yanlış seçim yaptınız! Tekrar deneyiniz .");


        }


    }
}
