//Java döngüler ile negatif bir değer girilene kadar kullanıcıdan
// girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

package yeniKodlar.teksayilar;
import java.util.Scanner;
public class teksayilar{
    public static void main(String[]args){

       int n;
       int total =0;

       Scanner inp =  new Scanner(System.in);

       do{
           System.out.print("Bir sayı giriniz :");
           n = inp.nextInt();

           if(n%2==1){
               total+=n;
           }
       }while(n>0);

        System.out.print("Tek sayıların toplamı :"+total);



















    }
}










