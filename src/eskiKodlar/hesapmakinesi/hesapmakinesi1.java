package hesapmakinesi;

import java.util.Scanner;
public class hesapmakinesi1 {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner input=new Scanner(System.in);
        System.out.print("İlk tamsayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci tamsayıyı giriniz:");
        n2= input.nextInt();
        System.out.print("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiminiz:");
        select =input.nextInt();

        switch(select){
            case 1:
                System.out.print("toplama="+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkartma="+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma="+(n1*n2));
                break;
            case 4:
                if(n2!=0) {
                    System.out.print("bölme=" + (n1 / n2));
                }else{
                    System.out.print("Bir sayı 0 a bölünemez.");

                } default:
                System.out.print("Hatalı giriş yaptınız.Tekrar deneyiniz.");

        }

    }
}
