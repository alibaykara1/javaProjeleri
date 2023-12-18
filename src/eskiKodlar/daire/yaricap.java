package yeniKodlar.daire;

import java.util.Scanner;

public class yaricap {
    public static void main(String[]args){
        int r;
        double pi=3.14,cevre,alan;

        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r =input.nextInt();

        cevre=2*pi*r;
        alan=pi*(r*r);

        System.out.println("Çevre:"+cevre);
        System.out.print("Alan:"+alan);

    }
}
