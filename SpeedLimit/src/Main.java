import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tmp = in.nextInt();
        int tmphours = 0;
        int sum = 0;
        while (tmp != -1) {
            for (int i = 0; i < tmp; i++) {
                int distance = in.nextInt();
                int hours = in.nextInt();
                sum += distance * (hours - tmphours);
                tmphours = hours;
            }
            tmp = in.nextInt();
            tmphours = 0;
            System.out.println(sum + " miles");
            sum = 0;
        }
    }
}
