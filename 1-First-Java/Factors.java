import java.io.*;

/**
 * Input a number and print all the factors of that number (use loops).
 */
public class Factors {
    public static void main(String[] args) throws IOException {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(IS);
        System.out.println("Enter the number: ");
        int number = Integer.parseInt(ob.readLine());
        System.out.println("Factors of " + number + " are:");
        int count = 1;
        while (count <= number) {

            if (number % count == 0) {
                System.out.print(count + " ");
            }
            count++;
        }
    }
}
