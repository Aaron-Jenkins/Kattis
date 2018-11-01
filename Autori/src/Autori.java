import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        StringBuilder abv = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if ((int)input.charAt(i) > 64 && (int)input.charAt(i) < 91) {
                abv.append(input.charAt(i));
            }
        }
        System.out.println(abv);
    }
}
