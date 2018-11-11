import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        if (h == 0) {
            h = 24;
        }
        if (m < 45) {
            h -= 1;
            m = 60 - (45 - m);
        } else {
            m -= 45;
        }
        System.out.println(h + " " + m);
    }
}