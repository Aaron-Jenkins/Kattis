import java.util.Scanner;

public class DeathKnightHero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int count = 0;

        for (int i = 0; i < x; i++) {
            String sc = in.next();
            if(!sc.contains("CD")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
