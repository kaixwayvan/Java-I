
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0, counter = 0, sum = 0;

        while (true) {
            num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                counter++;
                sum+=num;
            }
        }

        if (counter > 0) {
            System.out.println(1.0 * sum/counter);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
