import java.io.*;

/**
 * Write a program to print whether a number is even or odd, also take input.
 */
public class Check_Even_Odd {

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(is);
        int rem;
        System.out.print("Enter a number:");
        int Number = Integer.parseInt(ob.readLine());
        rem = Number / 2;
        if (Number == 0) {
            System.out.println("This is neither an even nor an odd number.It is a special number😕");
        } else if (rem * 2 == Number) {
            System.out.println(Number + " is an even Number");
        } else {
            System.out.println(Number + " is an odd Number");
        }
    }
}