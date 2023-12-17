
//Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
// Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın
//Kilo (kg) / Boy(m) * Boy(m)

package yeniKodlar.Vucut;
import java.util.Scanner;
public class kitleindeks {
    public static void main(String[] args) {

    double kilo , boy ,indeks;

    Scanner input = new Scanner (System.in);

        System.out.print("Boyunuzu (m) giriniz :");
        boy = input.nextDouble();
        System.out.print("Kilonuzu (kg) giriniz :");
        kilo =input.nextDouble();

        indeks = kilo / (boy*boy);

        System.out.print("Vücut kitle indeksiniz :"+indeks);


    }
}
