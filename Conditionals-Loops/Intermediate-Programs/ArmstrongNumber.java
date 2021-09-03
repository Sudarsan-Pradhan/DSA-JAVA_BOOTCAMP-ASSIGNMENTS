import java.io.*;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("\nEnter a number to check armstrong number: ");
            while (true) {
                long Number = in.nextLong();
                if (Number >= 0) {
                    long sum = 0;
                    long temp = Number;
                    while (Number != 0) {
                        long rem = Number % 10;
                        sum = sum + (rem * rem * rem);// Formula for armstrong number
                        Number /= 10;
                    }
                    if (sum == temp) {
                        System.out.println("This is an armstrong number");
                    } else {
                        System.out.println("This is not an armstrong number");
                    }
                    while (true) {
                        System.out.println("\n Do you want to check armstrong number within a given range(Y/N) ?");
                        char c = in.next().trim().charAt(0);
                        if (c == 'Y' || c == 'y') {
                            if (c == 'Y' || c == 'y') {
                                System.out.println("Enter minimum Range");
                                long minRange = in.nextLong();
                                System.out.println("Enter maximum Range");
                                long maxRange = in.nextLong();
                                if (minRange == maxRange) {
                                    System.out.println("Minimum range and maximum range should not be same🐷");
                                } else {
                                    System.out.print(
                                            "Armstrong numbers between " + minRange + " and " + maxRange + " are:");
                                    for (long j = minRange; j <= maxRange; j++) {
                                        long temp_Range = j;
                                        long sum_Range = 0;

                                        while (temp_Range != 0) {
                                            long remRange = temp_Range % 10;
                                            sum_Range = sum_Range + (remRange * remRange * remRange);// Formula for
                                                                                                     // armstrong number
                                            temp_Range /= 10;
                                        }
                                        if (sum_Range == j) {
                                            System.out.print(j + " ");
                                        }
                                    }
                                }
                            }
                        } else if (c == 'N' || c == 'n') {
                            System.out.println("It's Okay,No problem🧐");
                            break;
                        } else {
                            System.out.println("Enter valid input...!!");
                        }
                    }
                } else if (Number < 0) {
                    System.out.println("Number should be greater than 0...Try again !!😥");
                } else {
                    System.out.println("Invalid Input..Try later😞");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid Input.👎Try again......!!");
        }
        in.close();

    }
}
