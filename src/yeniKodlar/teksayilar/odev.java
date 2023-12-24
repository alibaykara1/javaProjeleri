//java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
// çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

package yeniKodlar.teksayilar;
import java.util.Scanner;
public class odev {
    public static void main(String[] args) {

        int l;
        int total =0;

        Scanner inp = new Scanner (System.in);

        do{
            System.out.print("Bir sayı giriniz :");
            l = inp.nextInt();

            if(l%4==0){
                total+=l;
            }
        }while(l%2==0);

        System.out.print("toplam :"+total);










    }
}
