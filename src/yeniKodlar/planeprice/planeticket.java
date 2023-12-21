/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
 Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 Mesafe başına ücret 0,10 TL / km olarak alın.
 İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre
 müşteriye aşağıdaki indirimleri uygulayın ;

 Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
 Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
 Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
 Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
 Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
package yeniKodlar.planeprice;

import java.util.Scanner;

public class planeticket {
    public static void main(String[] args) {

        int km, age, type;
        double perkm = 0.10, price, total, lasttotal;
        String tutar = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi (km) giriniz :");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz :");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz :\n1-Tek yön \n2-Gidiş,Dönüş");
        type = inp.nextInt();

        price = km * perkm;

        if (type != 1 && type != 2 && age < 0 && km < 0) {
            System.out.println("Hatalı giriş yaptınız !");
        } else {
            if (age < 12) {
                total = price * 0.5;
            } else if (age >= 12 && age <= 24) {
                total = price * 0.1;
            } else if (age > 64) {
                total = price * 0.3;
            }
        }
        if (type == 2) {
            total *= 0.2;
        } else {
            total*= 1  ;
        }

        System.out.print("Toplam ücret "+total);


    }
}






