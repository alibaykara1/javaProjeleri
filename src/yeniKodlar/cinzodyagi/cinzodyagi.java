/*Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        Doğum Tarihi %12 = 0 ➜ Maymun
        Doğum Tarihi %12 = 1 ➜ Horoz
        Doğum Tarihi %12 = 2 ➜ Köpek
        Doğum Tarihi %12 = 3 ➜ Domuz
        Doğum Tarihi %12 = 4 ➜ Fare
        Doğum Tarihi %12 = 5 ➜ Öküz
        Doğum Tarihi %12 = 6 ➜ Kaplan
        Doğum Tarihi %12 = 7 ➜ Tavşan
        Doğum Tarihi %12 = 8 ➜ Ejderha
        Doğum Tarihi %12 = 9 ➜ Yılan
        Doğum Tarihi %12 = 10 ➜ At
        Doğum Tarihi %12 = 11 ➜ Koyun*/
package yeniKodlar.cinzodyagi;

import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
        int dob;
        String animal = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum tarihinizi giriniz :");
        dob = input.nextInt();

        if (dob % 12 == 0) {
            animal = "MAYMUN";
        } else if (dob % 12 == 1) {
            animal = "HOROZ";
        } else if (dob % 12 == 2) {
            animal = "KÖPEK";
        } else if (dob % 12 == 3) {
            animal = "DOMUZ";
        } else if (dob % 12 == 4) {
            animal = "FARE";
        } else if (dob % 12 == 5) {
            animal = "ÖKÜZ";
        } else if (dob % 12 == 6) {
            animal = "KAPLAN";
        } else if (dob % 12 == 7) {
            animal = "TAVŞAN";
        } else if (dob % 12 == 8) {
            animal = "EJDERHA";
        } else if (dob % 12 == 9) {
            animal = "YILAN";
        } else if (dob % 12 == 10) {
            animal = "AT";
        } else if (dob % 12 == 11) {
            animal = "KOYUN";
        }

        System.out.println("Çin zodyağı burcunuz :"+animal);


    }

}

