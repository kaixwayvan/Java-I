
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a year: " );
        int year = Integer.valueOf(scan.nextLine());

        String s;

        if (year%400==0) {
            s = "The year is a leap year.";
        } else if (year%100==0) {
            s = "The year is not a leap year.";
        } else if (year%4==0) {
            s = "The year is a leap year.";
        } else {
            s = "The year is not a leap year.";
        }

        System.out.println(s);
    }
}
