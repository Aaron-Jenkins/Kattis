import java.util.Scanner;

public class AnotherCandies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int loop = Integer.parseInt(in.nextLine());
        int total;
        int sum;

        for (int i = 0; i < loop; i++) {
            total = in.nextInt();
            sum = 0;
            for (int j = 0; j < total; j++) {

                // input can be too big for long datatype, need to add try/except solution using biginteger in this scenario.
                if(i == loop -1 && j == total -1) {
                    sum+= in.nextInt();
                    in.close();
                } else {
                    sum += in.nextInt();
                }
            }
            if (sum % total == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}