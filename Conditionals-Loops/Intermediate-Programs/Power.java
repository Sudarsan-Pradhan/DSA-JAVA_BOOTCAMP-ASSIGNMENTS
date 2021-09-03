import java.util.Scanner;

/**
 * Power
 */
public class Power {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base:");
        int baseValue = input.nextInt();
        System.out.print("Enter Power:");
        int powerValue = input.nextInt();
        double result = Math.pow(baseValue, powerValue);
        System.out.println("So " + baseValue + " to the power " + powerValue + " = " + result);
        input.close();
    }
}