
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int seconds, hour_day = 24, min_day = 60, sec_day = 60;
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());

        seconds = days * hour_day * min_day * sec_day;

        System.out.println(seconds);

    }
}
