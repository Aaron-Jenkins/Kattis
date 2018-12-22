import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        List<String> cities = new ArrayList<>();

        for (int i = 0; i < testCases; i++) {
           int x = in.nextInt();
            cities.clear();
            //Add test case to list
            for (int j = 0; j < x; j++) {
                if (i == testCases-1 && j == x -1) {
                    cities.add(in.next());
                    in.close();
                } else {
                    cities.add(in.next());
                }
            }
            //Count unique in list
            for (int j = 0; j < cities.size()-1; j++) {
                for (int k = j+1; k < cities.size(); k++) {
                    if (cities.get(j).equals(cities.get(k))) {
                        cities.remove(k);
                        k--;
                    }
                }
            }
            System.out.println(cities.size());
        }
    }
}

