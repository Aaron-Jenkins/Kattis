import java.util.Scanner;

public class CD {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int jack = in.nextInt();
        int jill = in.nextInt();



        int tmp;
        while(jack != 0 && jill != 0){

            int[] jacks = new int[jack];
            int count = 0;

            for (int i = 0; i < jack; i++) {
                jacks[i] = in.nextInt();
            }


            for (int i = 0; i < jill; i++) {
                tmp = in.nextInt();
                for (int j = 0; j < jack; j++) {
                    if(tmp == jacks[j]){
                        count++;
                        j = jack;
                    }
                }
            }
            System.out.println(count);
            jack = in.nextInt();
            jill = in.nextInt();
        }

    }
}
