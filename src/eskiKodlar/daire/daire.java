package daire;

import java.util.Scanner;
public class daire{
    public static void main(String[]args){

        double r,alfa,alan,pi=3.14;

        Scanner input= new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz :");
        r = input.nextDouble();

        System.out.print("alfa açısı giriniz ");
        alfa = input.nextDouble();

        alan= (pi*r*r)*(alfa/360);

        System.out.print("Daire Diliminin Alanı :"+alan);


    }
}