import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String msg = in.next();
        int counter = 0;

        //loop through message
        for (int i = 0; i < msg.length(); i++) {
            //check each P position, if not P increment counter
            if (i % 3 == 0) {
                if (msg.charAt(i) != 'P') {
                    counter++;
                }
            }
            //check each E position, if not E increment counter
            if(i % 3 == 1) {
                if(msg.charAt(i) != 'E') {
                    counter++;
                }
            }
            //check each R position, if not R increment counter
            if(i % 3 == 2) {
                if(msg.charAt(i) != 'R') {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
