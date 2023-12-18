// sayıları büyükten küçüğe sıralama
// sayılarımız a,b ve c olsun
package yeniKodlar.Sayilarisiralama;

import java.util.Scanner;

public class buyukdenkucuk {
    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz :");
        c = input.nextInt();

        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);

        if (a > b && a > c) {
            if (b > c) {
                System.out.print("a>b>c");
            } else {
                System.out.print("a>c>b");
            }
        } else if (b > a && b > c) {
            if (a>c) {
                System.out.print("b>a>c");
            }else{
                System.out.print("b>c>a");
            }
        }else if(c>a && c>b){
            if(b>a){
                System.out.print("c>b>a");
            }else{
                System.out.print("c>a>b");
            }
        }


    }
}
