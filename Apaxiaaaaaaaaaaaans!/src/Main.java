import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        int len = name.length();
        List<Character> ans = new ArrayList<>();

        //if 1 character then print
        if (len == 1) {
            System.out.println(name);
            //add char to array if i+1 is different
        } else {
            for (int i = 0; i < len - 1; i++) {
                if (name.charAt(i) != name.charAt(i + 1)) {
                    ans.add(name.charAt(i));
                }
            }
            //add char to array if nothing was added during loop  (string of single letters such as "oooo")
            if(ans.size() == 0) {
                System.out.print(name.charAt(0));
                // Deal with last character
            } else {
                if(ans.get(ans.size()-1) != name.charAt(len-1)) {
                    ans.add(name.charAt(len-1));
                }
                // Print final array
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i));
                }
            }
        }
    }
}
