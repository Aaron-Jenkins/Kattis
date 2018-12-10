import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String[] lines = new String[x];

        in.nextLine();
        for (int i = 0; i < x; i++) {
            lines[i] = in.nextLine();
        }

        for (int i = 0; i < lines.length; i++) {
            if(lines[i].contains("Simon says")) {
                for (int j = 11; j < lines[i].length(); j++) {
                    System.out.print(lines[i].charAt(j));
                }
                System.out.println();
            }
        }
    }
}
