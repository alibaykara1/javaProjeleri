import java.util.Scanner;

public class cift {
    public static void main(String[] args) {

        int k;

        Scanner input = new Scanner (System.in);

        System.out.print("Bir sayı giriniz :");
        k = input.nextInt();

        for(int i=1 ; i<=k ;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }










    }
}