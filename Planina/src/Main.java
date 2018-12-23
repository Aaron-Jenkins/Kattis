import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        //top dots starts with 2
        int topDots = 2;

        // Calculate top dots
            for (int i = 0; i < x; i++) {
                topDots = (topDots*2)-1;
            }
        System.out.println(topDots*topDots);
    }
}
