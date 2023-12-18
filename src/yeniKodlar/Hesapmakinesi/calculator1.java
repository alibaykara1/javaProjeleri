// java ile if else kullanılarak hesap makinesi yapma

package yeniKodlar.Hesapmakinesi;
import java.util.Scanner;
public class calculator1 {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner input = new Scanner (System.in);

        System.out.print("Birinci sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz ");
        n2 = input.nextInt();

        System.out.println("Seçiniz :");
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        select = input.nextInt();

       if(select == 1){
           System.out.print("Toplama ="+(n1+n2));
       }else if(select==2){
           System.out.print("Çıkarma ="+(n1-n2));
       }else if(select==3){
            System.out.print("Çarpma ="+(n1*n2));
        }else if (select ==4){
           if(n2 != 0) {
               System.out.print("Bölme =" + (n1 / n2));
           }else{
               System.out.print("Bir sayı 0'a bölünemez !");
           }
       }else {
           System.out.println("Yanlış seçim yaptınız ! Lütfen tekrar deneyiniz .");
       }












    }
}
