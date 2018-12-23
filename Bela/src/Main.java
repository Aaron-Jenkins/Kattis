import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        String d = in.next();

        int counter = 0;

        // Define normal card values
        int A = 11;
        int K = 4;
        int Q = 3;
        int J = 2;
        int T = 10;

        //Define Dom values
        int JD = 20;
        int N = 14;

        //loop input
        for (int i = 0; i < x*4; i++) {
            String tmp = in.next();

            // Check for dom values
            if (tmp.contains(d) && tmp.contains("J")) {
                counter += JD;
            } else if (tmp.contains(d) && tmp.contains("9")) {
                counter += N;
            }
            // if not dom, add points as per problem
            else if (tmp.contains("A")) {
                counter += A;
            } else if (tmp.contains("K")) {
                counter += K;
            } else if (tmp.contains("Q")) {
                counter += Q;
            } else if (tmp.contains("J")) {
                counter += J;
            } else if (tmp.contains("T")) {
                counter += T;
            } else {
                counter += 0;
            }

        }
        System.out.println(counter);
    }
}
