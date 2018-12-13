import java.util.Scanner;

public class LastFactorialDigit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        int[] ans = new int[10];

        ans[0] = 1;
        ans[1] = 2;
        ans[2] = 6;
        ans[3] = 4;
        ans[4] = 0;
        ans[5] = 0;
        ans[6] = 0;
        ans[7] = 0;
        ans[8] = 0;
        ans[9] = 0;

        for (int i = 0; i < x; i++) {
            System.out.println(ans[in.nextInt()-1]);
        }
    }
}
