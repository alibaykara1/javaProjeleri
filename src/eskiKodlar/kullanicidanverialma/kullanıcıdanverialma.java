package kullanicidanverialma;

import java.util.Scanner;

public class kullanıcıdanverialma {
    public static void main(String[] args) {
        int a,b;

        Scanner input = new Scanner(System.in);

        System.out.print("A sayısını giriniz :");
        a=input.nextInt();

        System.out.print("B sayısını giriniz :");
        b=input.nextInt();

        System.out.println("A sayısı :"+a);
        System.out.println("B sayısı :"+b);
    }
}