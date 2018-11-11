import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        double qal = 0.00;

        for (int i = 0; i < count; i++) {
            qal += (in.nextDouble() * in.nextDouble());
        }

        System.out.println(qal);
    }
}
