package hesapmakinesi;

import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input= new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        n2 = input.nextInt();
        System.out.print("1-toplama\n2-çıkartma\n3-çarpma\n4-bölme\n");
        System.out.print("Seçiminiz:");
        select =input.nextInt();

        if(select==1) {
            System.out.print("Toplam:" + (n1 + n2));
        }else if(select==2){
            System.out.println("Çıkarma:"+(n1-n2));
        }else if(select==3){
            System.out.print("Çarpma:"+(n1*n2));
        }else if(select==4){
           if(n2!=0) {
               System.out.print("Bölme:" + (n1 / n2));
           }else{
               System.out.print("Bir sayı 0'a bölünemez !");
           }
            }else{
                System.out.print("Yanlış seçim yaptınız .Tekrar deneyiniz .");
        }




    }
}
