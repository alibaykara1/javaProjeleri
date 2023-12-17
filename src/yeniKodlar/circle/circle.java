//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//Alan Formülü : π * r * r;
//Çevre Formülü : 2 * π * r;

package yeniKodlar.circle;

import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        double pi=3.14,alan,cevre;
        int r;

        Scanner input = new Scanner (System.in);
        System.out.print("Yarıçap giriniz :");
        r = input.nextInt();

        cevre=2*pi*r;
        alan=pi*(r*r);

        System.out.println("Dairenin çevresi :"+cevre );
        System.out.print("Dairenin alanı :"+alan );
    }
}
