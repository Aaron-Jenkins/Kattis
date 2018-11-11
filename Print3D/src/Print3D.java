import java.util.Scanner;

public class Print3D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int counter = 0;
        float div = (in.nextInt());

        while (div > 1) {
            div /= 2;
            counter++;
        }

        System.out.println(counter + 1);
    }
}
