import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int a = 0, b = 0;


        while (n1 != 0) {
            a = a * 10 + n1 % 10;
            n1 = n1 / 10;
        }
        while (n2 != 0) {
            b = b * 10 + n2 % 10;
            n2 = n2 / 10;
        }
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}