import java.util.Scanner;

public class sicaklik {
    public static void main(String[] args) {
        int heat;

        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık giriniz:");
        heat=input.nextInt();

        if(heat < 5){
            System.out.print("Kayak yapabilirsiniz");
        }else if(heat<=25){
            if(heat>=15){
                System.out.print("Piknik yapabilirsiniz");
            }else{
                System.out.print("Sinemaya gidebilirsiniz");
            }
        }else{
            System.out.print("Yüzmeye gidebilirsiniz");
        }
    }
}
