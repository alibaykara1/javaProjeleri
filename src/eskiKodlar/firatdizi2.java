import java.util.Random;

public class firatdizi2 {
    public static void main(String[] args) {
        int [] ydizi = new int [10] ;

        Random random = new Random ();
        int toplam =0;
        for (int i = 0 ; i< ydizi.length ;i++) {
            ydizi[i] = random.nextInt(100);
             toplam += ydizi[i];
            System.out.print(ydizi[i]+"");
        }
        System.out.println("toplam :"+toplam);
    }
}
