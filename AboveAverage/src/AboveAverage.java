import java.text.DecimalFormat;
import java.util.Scanner;

public class AboveAverage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        //DecimalFormat df = new DecimalFormat("##########.000%");
        //df.setMultiplier(1);


        for (int i = 0; i < x; i++) {
            int gradeCount = in.nextInt();
            int sum = 0;
            float avg;
            int count = 0;
            int[] grades = new int[gradeCount];

            for (int j = 0; j < gradeCount; j++) {
                grades[j] = in.nextInt();
                sum += grades[j];
            }
            avg = sum / gradeCount;
            for (int j = 0; j < gradeCount; j++) {
                if(grades[j] > avg) {
                    count++;
                }
            }
            //System.out.println(df.format((float) 100 / gradeCount * count));
            System.out.printf("%.3f", (float) 100 / gradeCount * count);
            System.out.println("%");
        }
    }
}
