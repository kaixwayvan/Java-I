
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 1;

        System.out.print("Give a number? ");
        int num = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }

        System.out.println("Factorial: " + result);
    }
}
