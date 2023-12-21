//eğer girilen ders notları 0 ve 100 ün arasında değil ise ortalamaya katılmasın


package yeniKodlar.sinifigecme;
import java.util.Scanner;
public class sinifgecme2 {
    public static void main(String[] args) {

        int mat;

        Scanner input = new Scanner (System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat = input.nextInt();

        if (mat<100 && mat>0){
            System.out.println("");
        }else{
            System.out.println("geçerli bir puan giriniz");
        }






    }
}
