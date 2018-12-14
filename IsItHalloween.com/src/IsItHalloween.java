import java.util.Scanner;

public class IsItHalloween {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String date = in.next();
        int day = in .nextInt();

        if (date.equals("OCT") && day == 31) {
            System.out.println("yup");
        } else if (date.equals("DEC") && day == 25) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }

    }
}
