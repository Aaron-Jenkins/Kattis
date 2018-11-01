import java.util.ArrayList;
import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = in.nextInt();

        System.out.println((n * i) - n + 1);
    }
}
