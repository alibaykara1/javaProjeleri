package yeniKodlar.atmproject;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String password, username;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner inp = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz :");
            username = inp.nextLine();
            System.out.print("Şifrenizi giriniz :");
            password = inp.nextLine();

            if (username.equals("patika") && (password.equals("dev123"))) {
                System.out.println("Merhaba , kodluyoruz bankasına hoşgeldiniz !");
                do {
                    System.out.println("1-para yatırma\n" +
                            "2-para çekme\n" +
                            "3-bakiye sorgula\n" +
                            "4-çıkış ");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = inp.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktarı giriniz :");
                        int price = inp.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Çekmek istediğiniz miktarı giriniz :");
                        int price = inp.nextInt();
                        balance -= price;
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz :" + balance);
                    } else if (select == 4) {
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    }

                } while (select <= 4);
                System.out.println("Tekrar görüşmek üzere !");
                break;

            } else {
                right--;
                System.out.println("Yanlış giriş yaptınız tekrar deneyiniz !");
                if(right ==0 ){
                    System.out.print("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz .");
                }else{
                    System.out.println("Kalan hakkınız :"+right );
                }

            }


        }


    }
}
