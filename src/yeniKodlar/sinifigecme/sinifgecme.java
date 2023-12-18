//java koşullu ifadeler ile kullanıcının  not durumuna göre ortalamasını hesaplayan program
// Dersler : matematik,fizik,türkçe,kimya,müzik
//Geçme notu: 55
package yeniKodlar.sinifigecme;

import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = input.nextInt();
        System.out.print("Fizik notunuz :");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuz :");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz :");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz :");
        muzik = input.nextInt();

        double total = (mat +turkce+kimya+fizik+muzik)/5;

        System.out.println("Ortalamanız :"+total);

        if(total>=55){
            System.out.print("Dersi geçtiniz .");
        }else{
            System.out.print("Dersten kaldınız .");
        }


    }
}
