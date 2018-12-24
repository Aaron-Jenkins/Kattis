import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();

        //Add points to there list
        for (int i = 0; i < 3; i++) {
            L1.add(in.nextInt());
            L2.add(in.nextInt());
        }
        in.close();

        // Look for pair in 1st list and output the single
        int tmp = L1.get(0);
        int counter = 0;
        for (int i = 0; i < L1.size(); i++) {
            if (L1.get(i).equals(tmp)) {
                counter++;
            }
        }

        if(counter == 1) {
            System.out.print(tmp + " ");
        } else {
            if (L1.get(1).equals(tmp)) {
                System.out.print(L1.get(2) + " ");
            } else {
                System.out.print(L1.get(1) + " ");
            }
        }

        // Look for pair in 2nd list and output the single
        tmp = L2.get(0);
        counter = 0;
        for (int i = 0; i < L2.size(); i++) {
            if (L2.get(i).equals(tmp)) {
                counter++;
            }
        }

        if(counter == 1) {
            System.out.print(tmp);
        } else {
            if (L2.get(1).equals(tmp)) {
                System.out.print(L2.get(2));
            } else {
                System.out.print(L2.get(1));
            }
        }
    }
}
