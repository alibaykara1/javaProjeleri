package yeniKodlar.hipotenus;

import java.util.Scanner;

public class hipotenüs {
    public static void main(String[] args) {
   //Değişkenlerimizi oluşturalım
        int a,b;
        double c;

        //kullanıcıdan verilerimizi alalım,
        Scanner girdi=new Scanner(System.in);

        System.out.print("kenar 1 giriniz :");
        a=girdi.nextInt();
        System.out.print("kenar2 giriniz:");
        b=girdi.nextInt();

        c=Math.sqrt((a*a)+(b*b));

        System.out.print("HİPOTENÜS:"+c);





    }
}
