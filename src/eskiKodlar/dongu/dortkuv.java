package dongu;
import java.util.Scanner;

public class dortkuv {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner (System.in);
        System.out.print("Bir sayı giriniz :");
        n = inp.nextInt();

        for(int i=1 ; i<n ; i*=4){
            for(int k=1 ; k<n ;k*=5 ){
                System.out.println(i);
                System.out.println(k);
            }
        }

    }
}
