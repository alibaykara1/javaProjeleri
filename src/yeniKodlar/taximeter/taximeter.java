//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.
package yeniKodlar.taximeter;
import java.util.Scanner;
public class taximeter {
    public static void main(String[] args) {
        double  perkm=2.20,total;
        int km,openingfee =10;

        Scanner input =new Scanner (System.in);
        System.out.print("Kilometre giriniz :");
        km = input.nextInt();

        total = km*perkm+openingfee ;
        if (total<20){
            System.out.print("Ödenecek tutar : 20 tl ");
        }else{
            System.out.print("Ödenecek tutar :"+total);
        }

    }
}
