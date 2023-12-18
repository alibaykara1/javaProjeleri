// kullanıcıdan şifresini ve kullanıcı adını istediğimiz bir program

package yeniKodlar.kullanicigirisi;
import java.util.Scanner;
public class kullanicigiris {
    public static void main(String[] args) {

        String username,password;

        Scanner input = new Scanner (System.in);

        System.out.print("kullanıcı adınızı giriniz :");
        username = input.nextLine();
        System.out.print("Şifrenizi giriniz :");
        password = input.nextLine();

        if((username.equals("patika")) && (password.equals("java123"))){
            System.out.print("Giriş yaptınız !");
        }else{
            System.out.print("Hatalı giriş yaptınız ! Tekrar deneyiniz .");
        }

    }
}
