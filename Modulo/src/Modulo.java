import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x = 10;
        ArrayList<Integer> result = new ArrayList<Integer>();
        int toggle = 0;


        for (int i = 0; i < x; i++) {
            toggle = 0;
            int tmp = in.nextInt() % 42;
            for (int j = 0; j < result.size(); j++) {
                if(tmp == result.get(j)) {
                    toggle = 1;
                }
            }
            if (toggle == 0) {
                result.add(tmp);
            }
        }


        System.out.println(result.size());

    }
}
