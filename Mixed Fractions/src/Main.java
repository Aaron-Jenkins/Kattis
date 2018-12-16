import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numerator = in.nextInt();
        int denominator = in.nextInt();
        int wholeNum;


        while (numerator != 0) {
            wholeNum = numerator / denominator;
            System.out.println(wholeNum + " " + numerator % denominator + " / " + denominator);
            numerator = in.nextInt();
            denominator = in.nextInt();
        }
    }
}
