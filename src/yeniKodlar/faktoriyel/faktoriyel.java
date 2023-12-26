//javada girilen sayının faktöriyelini hesaplama
// n! =1*2*3*4*...*n

package yeniKodlar.faktoriyel;
import java.util.Scanner ;
public class faktoriyel{
    public static void main(String[] args) {

        int n,total =1;

        Scanner input = new Scanner (System.in);

        System.out.print("Faktöriyeli alınacak olan sayıyı giriniz :");
        n = input.nextInt();


        for(int i =1 ;i<=n;i++){
            total*=i;
        }

        System.out.print(n+". faktöriyel :"+total);





    }
}