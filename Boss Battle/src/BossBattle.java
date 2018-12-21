import java.util.Scanner;

public class BossBattle {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int pillar = in.nextInt();

        if (pillar <= 3) {
            System.out.println(1);
        } else {
            System.out.println(pillar - 2);
        }



    }
}
