package notOrtalamasi;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        int turkce,matematik,fizik,kimya,muzik;

        Scanner oppa=new Scanner(System.in);
        System.out.print("Türkçe notunuzu giriniz:");
        turkce = oppa.nextInt();

        System.out.print("Matematik notunuzu giriniz:");
        matematik= oppa.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik= oppa.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya=oppa.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik=oppa.nextInt();

        double avarage=(matematik+turkce+muzik+fizik+kimya)/5;

        if(avarage<=55){
            System.out.println("Sınavdan kaldınız !\nSeneye Görüşmek üzere !");

        }else if(avarage>55){
            System.out.println("Sınavı geçtiniz !");
        }
        System.out.print("ortalamanız :"+avarage);





    }
}