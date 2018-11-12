import java.util.Scanner;

public class pokerhand {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] hand;
        hand = in.nextLine().split("");
        String[] values = new String[5];
        int counter = 0;


        for (int i = 0; i < 13; i++) {
            values[counter] = hand[i];
            i+=2;
            counter++;
        }

        String temp = values[0];
        //String card = values[0];
        counter = 0;
        int max = 0;
        for (int i = 0; i < values.length; i++) {
            if (temp.equals(values[i])) {
                counter++;
            }
            if (counter > max) {
                max = counter;
                //card = temp;
            }
        }
        System.out.println("Max is: " + max);
        /*
        for (int i = 0; i < hand.length; i++) {
            System.out.println("Hand: " + "i: " + i + hand[i]);
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println("Values: " + values[i]);
        }
        */
    }
}
