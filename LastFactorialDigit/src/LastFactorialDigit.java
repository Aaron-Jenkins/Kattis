import java.util.List;
import java.util.Scanner;

public class LastFactorialDigit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int ans = 0;
        int tmp;
            for (int i = 0; i < x; i++) {
                tmp = in.nextInt();
                for (int j = 0; j < tmp; j++) {
                    if (j == 0) {
                        j = 1;
                    }
                    if (tmp == 1) {
                        ans = 1;
                    } else {
                        ans = j * (j+1);
                    }
                }
                System.out.println(ans);
            }
    }
}
