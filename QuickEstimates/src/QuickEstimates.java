import java.util.Scanner;

public class QuickEstimates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        in.nextLine();

        for (int i = 0; i < x; i++) {
            String tmp = in.nextLine();
            System.out.println(tmp.length());
        }
    }
}
