//Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//(Not : KDV tutarını 18% olarak alın)
//KDV'siz Fiyat = 10;
//KDV'li Fiyat = 11.8;
//KDV tutarı = 1.8;
//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
// KDV tutarı hesaplayan programı yazınız.

package yeniKodlar.KDVtutar;
import java.util.Scanner ;
public class kdv2 {
    public static void main(String[] args) {
        double  tutar,kdvlitutar,kdvOran,kdvTutar;

        Scanner input = new Scanner (System.in);
        System.out.print("Tutar giriniz :");
        tutar = input.nextDouble();

        if (tutar<1000){
            kdvOran = 0.18;
        }else{
            kdvOran = 0.8;
        }

        kdvTutar= tutar*kdvOran;
        kdvlitutar = tutar + kdvTutar;

        System.out.println("Tutar :"+tutar);
        System.out.println("KDV oranı :"+kdvOran);
        System.out.println("KDV tutarı :"+kdvTutar);
        System.out.print("KDVli tutar :"+kdvlitutar);

    }
}
