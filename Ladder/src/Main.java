import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // h / sin(v)

        Scanner in = new Scanner(System.in);

        double h = in.nextInt();
        double v = in.nextInt();
        double vr = Math.toRadians(v);

        double sin = Math.sin(vr);

        double ans = h / sin;

        System.out.println((int)Math.ceil(ans));
    }
}
