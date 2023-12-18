//Koşullar :
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

package yeniKodlar.havasicakligi;
import java.util.Scanner ;
public class etkinlik {
    public static void main(String[] args) {

        int heat ;

        Scanner input = new Scanner (System.in);
        System.out.print("Sıcaklık giriniz :");
        heat = input.nextInt();

        if ( heat<5 ){
            System.out.print("Kayak yapabilirsiniz .");
        }else if(heat>5 && heat<15){
            System.out.print("Sinemaya gidebilirisiniz .");
        }else if (heat>15 && heat<25 ){
            System.out.print("Pikniğe gidebilirisiniz .");
        }else if( heat >25){
            System.out.print("yüzmeye gidebilirsiniz .");
        }










    }
}
