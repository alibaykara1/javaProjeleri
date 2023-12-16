package kosulluIfadeler;

public class ifElse {
    public static void main(String[] args) {
        int deger1 = 50;
        String metib =  "Agac";
        if (deger1 == 10){
            System.out.println("Değer 1 10 a eşit");
        }
        else if (deger1 != 20) {
            System.out.println("10 20 ye eşit d eğil");
        }else if (deger1 <= 20) {
            System.out.println("10 <= 20 ");
        }else{
            System.out.println("Hiç bir koşul sağlanmadı");
        }
    }
}
