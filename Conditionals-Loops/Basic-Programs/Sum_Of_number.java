import java.io.*;

/**
 * Take integer inputs till the user enters 0 and print the sum of all numbers
 * (HINT: while loop)
 */
public class Sum_Of_number {
    public static void main(String[] args) throws IOException {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(IS);
        System.out.print("Enter the number: ");
        int number;
        int sum = 0;
        while ((number = Integer.parseInt(input.readLine())) != 0) {
            sum = sum + number;
        }
        System.out.println("Total Sum =" + sum);
        input.close();
    }
}
