import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] cards = in.next().split("");
        int t = 0;
        int c = 0;
        int g = 0;


        for (int i = 0; i < cards.length; i++) {
            switch (cards[i]) {
                case "T":
                    t++;
                    break;
                case "C":
                    c++;
                    break;
                default:
                    g++;
                    break;
            }
        }


        //Check min
        int min = t;
        if (g < min) {
            min = g;
        }
        if (c < min) {
            min = c;
        }
        System.out.println((int)(Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2))+7*min);

    }
}
