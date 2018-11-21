import java.util.Scanner;

public class AnotherCandies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int loop = Integer.parseInt(in.nextLine());
        int total = in.nextInt();
        int sum = 0;
        //int cases[];

        /*for (int i = 0; i < loop; i++) {
            total = Integer.parseInt(in.nextLine());
            cases = new int[total];
            for (int j = 0; j < total; j++) {
                cases[i] = Integer.parseInt(in.nextLine());
                sum += cases[i];
                System.out.println("I: " + i + " " + cases[i]);
            }
            sum = 0;
            in.nextLine();
        }*/

        for (int i = 0; i < loop; i++) {
            for (int j = 0; j < total; j++) {
                sum += in.nextInt();
            }
            if (sum % total == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            total = in.nextInt();
            sum = 0;
        }

        sum += in.nextInt();
        if (sum % total == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
