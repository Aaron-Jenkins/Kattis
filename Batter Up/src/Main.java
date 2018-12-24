import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int sum = 0;
        int counter = 0;

        //Loop input
        for (int i = 0; i < x; i++) {
            int tmp = in.nextInt();
            // if not walk, sum bats and count
            if (tmp != -1){
                counter++;
                sum += tmp;
            }
        }
        System.out.println((float) sum / counter);
    }
}
