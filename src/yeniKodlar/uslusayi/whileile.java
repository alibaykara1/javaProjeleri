// java ile kullanıcının girdiği değerler ile üslü sayı hesaplaan program yazıyoruz .

package yeniKodlar.uslusayi;

import java.util.Scanner;

public class whileile {
    public static void main(String[] args) {

        int n, k,total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz :");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz :");
        k = input.nextInt();

        int i=1;
        while(i<=k){
            total*=n;
            i++;
        }

        System.out.print(n+" sayısının "+k+". kuvveti ="+total);



    }

}
