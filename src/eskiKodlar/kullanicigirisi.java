
import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {

        String username ,password ;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı giriniz:");
        username =input.nextLine();

        System.out.print("Şifrenizi Giriniz:");
        password = input.nextLine();

        if(username.equals("patika")&&(password.equals("java123"))){
            System.out.print("Giriş yaptınız!");
        }else{
            System.out.print("Giriş yapamadınız!");
        }
    }
}
