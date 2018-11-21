import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int loop = in.nextInt();
        int count = 0;

        for (int i = 0; i < loop; i++) {
            if (in.nextInt() < 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
