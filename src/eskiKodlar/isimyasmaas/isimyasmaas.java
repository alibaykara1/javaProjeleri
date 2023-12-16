package isimyasmaas;
import java.util.Scanner;

public class isimyasmaas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ad Soyad Giriniz:");
        String adsoyad= input.nextLine();

        System.out.print("Yaşınızı Giriniz :");
        int yas= input.nextInt();

        System.out.print("Maaşınızı Giriniz :");
        double maas= input.nextDouble();

        System.out.println("ADINIZ SOYADINIZ :"+adsoyad);
        System.out.println("YAŞINIZ:"+yas   );
        System.out.print("MAAŞINIZ:"+maas);



    }
}
