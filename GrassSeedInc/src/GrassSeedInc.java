import java.util.Scanner;

public class GrassSeedInc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float cost = in.nextFloat();
        int n = in.nextInt();
        float ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans + (in.nextFloat() * in.nextFloat());
        }
        System.out.println(ans * cost);
    }
}
