//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//𝜋 sayısını = 3.14 alınız.
//Formül : (𝜋 * (r*r) * 𝛼) / 360
package yeniKodlar.circle;
import java.util.Scanner;
public class ödevc {
    public static void main(String[] args) {
        int r ,alfa ;
        double pi=3.14;

        Scanner input = new Scanner (System.in);

        System.out.print("Yarıçap giriniz :");
        r = input.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz :");
        alfa = input.nextInt();

        double alan = (pi*(r*r)*alfa) / 360;

        System.out.print("Daire diliminin alanı :"+alan );






    }
}
