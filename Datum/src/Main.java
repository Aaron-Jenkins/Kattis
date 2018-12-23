import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);

        String day = in.next();
        String month = in.next();

        //format day and month as date
        String input_date = day+"/"+month+"/"+"2009";
        //Define date format
        SimpleDateFormat input_date_format=new SimpleDateFormat("dd/MM/yyyy");
        //Get date object which details day
        Date dt1=input_date_format.parse(input_date);
        //Define new format to extract full day
        DateFormat day_name_format=new SimpleDateFormat("EEEE");
        //Save full day to string
        String day_name=day_name_format.format(dt1);

        System.out.println(day_name);
    }
}
