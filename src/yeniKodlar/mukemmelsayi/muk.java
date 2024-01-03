package yeniKodlar.mukemmelsayi;

import java.util.Scanner;

public class muk {
    public static void main(String[] args) {
        int sayi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        sayi = inp.nextInt();

        int bolentop =0;
        for(int i=1 ;i<sayi;i++){
            if(sayi % i==0){
                bolentop +=i;
            }
        }

        if(sayi == bolentop){
            System.out.print(sayi+" sayısı mükemmel bir sayıdır .");
        }else{
            System.out.print(sayi+" sayısı mükemmel bir sayı değildir .");
        }

    }
}
