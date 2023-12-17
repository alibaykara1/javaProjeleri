//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//𝑢 = (a+b+c) / 2
//Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
// kenar uzunlukları a , b ve c olsun

package yeniKodlar.hipotenus;
import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
    int a,b,c;
    double  u ,alan  ;

        Scanner input = new Scanner (System.in);
        System.out.print("A kenarını giriniz :");
        a =input.nextInt();
        System.out.print("B kenarını giriniz :");
        b=input.nextInt();
        System.out.print("C kenarını giriniz :");
        c=input.nextInt();

        u = (a+b+c)/2;

        alan=Math.sqrt( u * (u - a)* (u - b) * (u - c));

        System.out.print("Üçgenin alanı :"+alan);









    }
}
