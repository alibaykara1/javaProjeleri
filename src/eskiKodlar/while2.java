

public class while2 {
    public static void main(String[] args) {
        int left =100, right=200;

        while(++left<--right) {
            System.out.print("100 ile 200 ün ortası :" + left);
        }
    }
}
