import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int matches = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        double d = Math.sqrt(Math.pow(w,2) + Math.pow(h,2));

        for (int i = 0; i < matches; i++) {
            if(in.nextInt() <= d) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }

        }

    }
}
