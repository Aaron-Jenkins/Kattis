import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetailedDifferences {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        List<String> pairs = new ArrayList<>();

        // Loop for testcases
        for (int i = 0; i < x; i++) {
            // Loop for pair
            for (int j = 0; j < 2; j++) {
                if (i == x-1 && j == 1) {
                    pairs.add(in.next());
                    in.close();
                } else {
                    pairs.add(in.next());
                }
            }
            // Print pairs in order
            System.out.println(pairs.get(0));
            System.out.println(pairs.get(1));

            // Compare pairs and print differences
            for (int j = 0; j < pairs.get(0).length(); j++) {
                if (pairs.get(0).charAt(j) == pairs.get(1).charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            pairs.clear();
        }
    }
}
