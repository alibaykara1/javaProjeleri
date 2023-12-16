package taksi;
import java.util.Scanner;
public class taksi {
    public static void main(String[] args) {

        double km,perKm=2.20,total=10;

        Scanner girdi=new Scanner(System.in);
        System.out.print("Bir km değeri giriniz :");
        km=girdi.nextDouble();

        total+=perKm*km;
        total= (total<20) ? 20 : total;
        System.out.print("Ödenecek tutar:"+total);
    }
}
