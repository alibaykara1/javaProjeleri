// java ile kombinasyon hesaplayan program yazma
//kombinasyon formülü =C(n,r) = n! / (r! * (n-r)!)

package yeniKodlar.faktoriyel;

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {

        int n, r;
        int factoriyal1 = 1, factoriyal2 = 1, factoriyal3 = 1,combination;

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz :");
        n = input.nextInt();
        System.out.print("R sayısını giriniz :");
        r = input.nextInt();

        // n nin faktöriyelini aldım

        for (int i = 1; i <= n; i++) {
            factoriyal1 *= i;
        }

        for (int i = 1; i <= r; i++) {
            factoriyal2 *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            factoriyal3 *= i;
        }

        combination = factoriyal1 / (factoriyal2*factoriyal3);

        System.out.println("N'nin faktöriyeli :"+factoriyal1);
        System.out.println("R'nin faktöriyeli :"+factoriyal2);
        System.out.print("N'nin R'li kombinasyonu :"+combination);





    }
}
