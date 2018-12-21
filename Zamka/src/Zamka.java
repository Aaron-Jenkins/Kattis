import java.util.Scanner;

public class Zamka {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int l = in.nextInt();
        int d = in.nextInt();
        int x = in.nextInt();
        int n = 0;
        int m = 0;


        // get min value n
        for (int i = l; i <= d; i++) {
            int sum = 0;
            int tmp = i;
            while ( tmp > 0) {
                sum = sum + tmp % 10;
                tmp = tmp / 10;
            }
            if (sum == x) {
                n = i;
                break;
            }
        }
        System.out.println(n);

        // get max value m
        for (int i = d; i >= l; i--) {
            int sum = 0;
            int tmp = i;
            while ( tmp > 0) {
                sum = sum + tmp % 10;
                tmp = tmp / 10;
            }
            if (sum == x) {
                m = i;
                break;
            }
        }
        System.out.println(m);


    }




}
