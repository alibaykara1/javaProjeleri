// Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
// ve ortalamalarını hesaplayıp ekrana bastırılan program

package yeniKodlar.notOrt;

import java.util.Scanner;
public class orthspprog {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz :");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz :");
        kimya= input.nextInt();

        System.out.print("Türkçe notunuzu giriniz :");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz :");
        tarih  = input.nextInt();

        System.out.print("Müzik notunuzu giriniz :");
        muzik = input.nextInt();

        int notOrt = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        if (notOrt>50)
            System.out.println("Sınavı geçtiniz !");
        else
            System.out.println("Sınavı geçemediniz seneye görüşürüz !");

        System.out.print("Not ortalamanız :"+notOrt);

    }
}
