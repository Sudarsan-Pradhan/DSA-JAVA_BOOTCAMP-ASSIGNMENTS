import java.io.*;

/**
 * Take in two numbers and an operator (+, -, *, /) and calculate the value. #
 * (Use if conditions)
 */
public class MathOperation {
    public static void main(String[] args) throws IOException {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(IS);
        System.out.print("Enter the first number:");
        int FirstNumber = Integer.parseInt(input.readLine());
        System.out.print("Enter the first number:");
        int SecondNumber = Integer.parseInt(input.readLine());
        System.out.print("Choose the operator among +,-,* and /:");
        char Operator = (char) input.read();
        if (Operator == '+') {
            System.out.println("You choose '+'");
            System.out.println(
                    "So the sum of " + FirstNumber + " and " + SecondNumber + " is " + (FirstNumber + SecondNumber));
        } else if (Operator == '-') {
            System.out.println("You choose '-'");
            System.out.println("So the subtraction of " + SecondNumber + " from " + FirstNumber + " is "
                    + (FirstNumber - SecondNumber));
        } else if (Operator == '*') {
            System.out.println("You choose '*'");
            System.out.println("So the multiplication of " + FirstNumber + " and " + SecondNumber + " is "
                    + (FirstNumber * SecondNumber));
        } else if (Operator == '/') {
            System.out.println("You choose '/'");
            System.out.println("So the division of " + FirstNumber + " by " + SecondNumber + " is "
                    + (FirstNumber / SecondNumber));
        } else {
            System.out.println("Sorry You did not enter the correct operator!!");
        }
    }
}
