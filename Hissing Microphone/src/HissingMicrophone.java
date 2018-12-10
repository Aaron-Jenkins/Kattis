import java.util.Scanner;

public class HissingMicrophone {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        int toggle = 0;

        for (int i = 0; i < line.length()-1; i++) {
            if (line.charAt(i) == 's' && line.charAt(i+1) == 's') {
                System.out.println("hiss");
                toggle = 1;
                break;
            }
        }

        if (toggle == 0) {
            System.out.println("no hiss");
        }

    }

}
