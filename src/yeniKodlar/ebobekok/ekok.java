//EKOK = (n1*n2) / EBOB

package yeniKodlar.ebobekok;

import java.util.Scanner;

public class ekok {
    public static void main(String[] args) {
        int n1, n2;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz :");
        n1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        n2 = inp.nextInt();

        int ebob =1;

        if (n2 > n1) {
            for (int i = 1; i <= n1; i++) {
                if(n1%i==0 && n2%i==0){
                    ebob = i;
                }
            }
        } else if(n1>n2){
            for(int i=1 ; i<=n2 ;i++){
                if(n1%i==0 && n2%i==0){
                    ebob = i;
                }
            }
        }
        System.out.println("Ebob :"+ebob);

        int ekok = (n1*n2)/ebob;
        System.out.print("Ekok :"+ekok);


    }
}
