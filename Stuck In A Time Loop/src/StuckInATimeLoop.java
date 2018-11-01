import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + " Abracadabra");
        }
    }
}
