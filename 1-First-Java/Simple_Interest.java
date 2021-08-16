import java.util.Scanner;

/**
 * @ Write a program to input principle, time and rate (P, T, R) from user and
 * find Simple Interest.
 */
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the PrincipalAmount:");
        float PrincipalAmount = input.nextFloat();
        System.out.print("Enter the rate of Interest:");
        float RateOfInterest = input.nextFloat();
        System.out.print("Enter the Year:");
        int Year = input.nextInt();

        float SimpleInterest = (PrincipalAmount * RateOfInterest * Year) / 100;
        System.out.println("The Simple Interest is " + SimpleInterest);
        input.close();

    }

}
