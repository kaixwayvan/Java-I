
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringValue = scan.nextLine();

        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double floatValue = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean statement = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + stringValue);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatValue);
        System.out.println("You gave the boolean " + statement);
    }
}
