import java.util.ArrayList;
import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> input  = new ArrayList<>();

        while (in.hasNextLine()) {
            input.add(in.nextLine());
        }

        int x = Integer.parseInt(input.get(0));
        int y = Integer.parseInt(input.get(1));

        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else if (y < 0) {
                System.out.println("4");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
