import java.util.Scanner;

public class while1{
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess= true;

        Scanner input = new Scanner(System.in);

        while(isPasswordSuccess){
            System.out.print("şifrenizi giriniz:");
            password = input.nextInt();

            if(password==123){
                System.out.println("doğru");
                isPasswordSuccess=false;
            }else{
                System.out.println("yanlış");
            }
        }



    }
}