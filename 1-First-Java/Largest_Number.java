import java.util.*;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is larger than " + secondNumber);
        } else {
            System.out.println(secondNumber + " is larger than " + firstNumber);
        }
        input.close();
    }
}
