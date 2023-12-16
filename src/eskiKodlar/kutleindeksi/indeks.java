package kutleindeksi;

import java.util.Scanner;

public class indeks {
    public static void main(String[] args) {
        double  boy,kilo,ind;

        Scanner indeks = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :");
        boy = indeks.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = indeks.nextDouble();

        ind = kilo/(boy*boy);

        System.out.print("Vücut kitle indeksiniz :"+ind);






    }
}
