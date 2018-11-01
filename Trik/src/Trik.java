import java.util.Scanner;

public class Trik {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int[] cups = {1, 2, 3};

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                int temp = cups[0];
                cups[0] = cups[1];
                cups[1] = temp;
            } else if (input.charAt(i) == 'B') {
                int temp = cups[1];
                cups[1] = cups[2];
                cups[2] = temp;
            } else {
                int temp = cups[0];
                cups[0] = cups[2];
                cups[2] = temp;
            }
        }

        for (int i = 0; i < cups.length; i++) {
            if (cups[i] == 1) {
                System.out.println(i+1);
            }
        }
    }
}
