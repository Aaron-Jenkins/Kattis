import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int a;
        int b;
        List<Integer> days = new ArrayList<>();

        // Loop test cases
        for (int i = 0; i < x; i++) {
            a = in.nextInt();
            b = in.nextInt();
            int range = b-a+1;
            // Loop date range, if not in list add day to it
            for (int j = 0; j < (range); j++) {
                if(!days.contains(a)) {
                    days.add(a);
                    a += 1;
                } else {
                    a += 1;
                }
            }
        }
        System.out.println(days.size());
    }
}
