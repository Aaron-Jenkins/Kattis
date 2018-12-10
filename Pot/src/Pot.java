import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int len = in.nextInt();
                int res = 0;
                for (int i = 0; i < len; i++) {
                    int tmp = in.nextInt();
                    int pow = tmp % 10;
                    res += Math.pow(tmp / 10, pow);
                }
                System.out.println(res);
            }
}
