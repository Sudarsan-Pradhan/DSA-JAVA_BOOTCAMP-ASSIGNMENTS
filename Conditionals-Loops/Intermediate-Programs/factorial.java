import java.util.*;

/**
 * factorial
 */
public class factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a  number:");
        int Number = in.nextInt();
        int factorial_Number = fact(Number);
        System.out.println("Factorial of " + Number + " is" + factorial_Number);
        in.close();

    }

    public static int fact(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }
}