import java.io.*;

/**
 * Greeting_Message
 */
public class Greeting_Message {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Name:");
        String Name = input.readLine();
        System.out.println("Hello " + Name);
    }
}