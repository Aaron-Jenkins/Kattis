import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RoamingRomans {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int EnglishMile = 5280;
    int RomanMile = 4854;
    float input = Float.parseFloat(in.nextLine());
    float in1k = input * 1000;
    float result = in1k * EnglishMile / RomanMile;

        DecimalFormat df = new DecimalFormat("#####");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(result));
    }
}
