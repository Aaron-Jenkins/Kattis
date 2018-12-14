import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int denominator = in.nextInt();
        int numerator = in.nextInt();
        int wholeNum;


        while (denominator != 0) {
            wholeNum = denominator / numerator;
            System.out.println(wholeNum + " " + denominator % numerator + " / " + numerator);
            denominator = in.nextInt();
            numerator = in.nextInt();
        }


    }
}
