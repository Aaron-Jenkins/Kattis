import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String w1 = in.next();
        String w2 = in.next();

        if (w2.length() <= w1.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }
}
