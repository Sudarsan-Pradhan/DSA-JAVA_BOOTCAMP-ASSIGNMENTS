import java.io.*;

public class Sum_of_Digits_of_Number {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int Number = Integer.parseInt(reader.readLine());
        int sum = 0;
        int temp = Number;
        while (Number !=0) {
            int rem = Number % 10;
            sum = rem + sum;
            Number = Number / 10;
        }
        
        System.out.println("Sum of");
        int rev = 0;
        while (temp !=0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        while (rev !=0) {
            int rem = rev % 10;
            System.out.print(rem+" + ");
            rev = rev / 10;
        }

        System.out.print("= "+sum);
    }
}
//