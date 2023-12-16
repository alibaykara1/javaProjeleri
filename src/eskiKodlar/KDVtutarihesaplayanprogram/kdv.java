package KDVtutarihesaplayanprogram;

import java.util.Scanner;

public class kdv {
    public static void main (String[]args){
        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz :");
        tutar=inp.nextDouble();

        kdvTutar=tutar*kdvOran;
        kdvliTutar=kdvTutar+tutar;

        System.out.println("Tutar:"+tutar);
        System.out.println("KDV Oran:"+kdvOran);
        System.out.println("KDV Tutarı:"+kdvTutar);
        System.out.println("KDVli Tutar:"+kdvliTutar);


    }
}




