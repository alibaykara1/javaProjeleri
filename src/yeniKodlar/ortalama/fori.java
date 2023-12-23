//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
// 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

package yeniKodlar.ortalama;
import java.util.Scanner ;
public class fori {
    public static void main(String[] args) {

        int number,counter =0,total=0;

        Scanner inp = new Scanner (System.in);
        System.out.print("Bir sayı giriniz :");
        number = inp.nextInt();

        for (int i =1 ; i<=number ;i++){
            if (i%12==0){
                counter++;
                total += i;
            }
        }
        System.out.println(total/counter);




    }
}