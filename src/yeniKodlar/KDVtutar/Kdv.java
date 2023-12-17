//Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//(Not : KDV tutarını 18% olarak alın)
//KDV'siz Fiyat = 10;
//KDV'li Fiyat = 11.8;
//KDV tutarı = 1.8;
package yeniKodlar.KDVtutar;
 import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {

    double tutar,kdvlitutar,kdvoran=0.18,kdvtutar;

    System.out.print("Bİr tutar giriniz :");
    Scanner input = new Scanner (System.in);
    tutar = input.nextDouble();


    kdvtutar=tutar*kdvoran;
    kdvlitutar=kdvtutar+tutar;

        System.out.println("Tutar :"+tutar);
        System.out.println("KDV oranı :"+kdvoran);
        System.out.println("KDV tutarı :"+kdvtutar);
        System.out.print("KDV li tutar :"+kdvlitutar);







    }
}
