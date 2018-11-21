import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int LINES = 5;
        int MAX = 0;
        int row = 0;

        for (int i = 0; i < LINES; i++) {
            int temp = in.nextInt() + in.nextInt() + in.nextInt() + in.nextInt();
            if (temp > MAX) {
                MAX = temp;
                row = i + 1;
            }
        }
        System.out.println(row + " " + MAX);

    }
}
