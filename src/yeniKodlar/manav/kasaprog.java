//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
// toplam tutarını ekrana yazdıran programı yazın.
//Meyveler ve KG Fiyatları
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL

package yeniKodlar.manav;

import java.util.Scanner;
public class kasaprog {
    public static void main(String[] args) {

     double armut = 2.14,aprice;
     double elma = 3.67,eprice;
     double domates = 1.11,dprice;
     double muz = 0.95,mprice ;
     double patlican =5.0,pprice;

    Scanner input = new Scanner (System.in);

        System.out.print("Armut kilo girin :");
        double kgarmut = input.nextDouble();
        System.out.print("Elma kilo giriniz :");
        double kgelma = input.nextDouble();
        System.out.print("Domates kilo giriniz :");
        double kgdomates = input.nextDouble();
        System.out.print("Muz fiyatı giriniz :");
        double kgmuz = input.nextDouble();
        System.out.print("Patlıcan fiyatını giriniz :");
        double kgpatlican = input.nextDouble();

       aprice=armut*kgarmut;
       eprice=elma*kgelma;
       dprice=domates*kgdomates;
       mprice=muz*kgmuz;
       pprice=patlican*kgpatlican;

       double total = aprice+eprice+dprice+mprice+pprice;

        System.out.println("Armut kaç kilo ?"+kgarmut);
        System.out.println("Elma kaç kilo ?"+kgelma);
        System.out.println("Domates kaç kilo ?"+kgdomates);
        System.out.println("Muz kaç kilo ?"+kgmuz);
        System.out.println("Patlıcan kaç kilo ?"+kgpatlican);
        System.out.println("Toplam tutar :"+total);


    }
}
