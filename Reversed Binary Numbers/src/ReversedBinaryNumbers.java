import java.util.Scanner;

public class ReversedBinaryNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        char[] bin = Integer.toBinaryString(x).toCharArray();
        char[] result = new char[bin.length];



        for (int i = 0; i < bin.length; i++) {
            result[i] = bin[(bin.length - 1) - i];
        }

        String res = new String(result);
        //System.out.println(bin);
        //System.out.println(result);
        System.out.println(Integer.parseInt(res, 2));

    }
}
