
//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yaz
// a ve b dik kenarlar c hipotenüs
package yeniKodlar.hipotenus;
import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
    int a,b;
    double c;
    Scanner input = new Scanner (System.in);
        System.out.print("A kenarını giriniz : ");
        a = input.nextInt();

        System.out.print("B kenarını giriniz :");
        b = input.nextInt();

        c =Math.sqrt((a*a)+(b*b));

        System.out.print("Hipotenüs :"+c);




    }
}
