import java.util.*;

/**
 * Average_Of_N_Numbers
 */
public class Average_Of_N_Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to enter: ");
        int elements = input.nextInt();

        int number[] = new int[elements];
        int sum = 0;

        if (elements > 0) {
            for (int i = 0; i < elements; i++) {
                System.out.print("Enter Numbers: ");
                number[i] = input.nextInt();
                sum = sum + number[i];
            }
            float avg = sum / elements;
            System.out.println("Average of the entered numbers is " + avg);
        } else {
            System.out.println("Program terminated....😞");
        }
        input.close();

    }
}