import java.util.Scanner;

public class SumOf_N_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to enter:");
        int elementNumber = scanner.nextInt();
        System.out.println("Enter number: ");
        int[] numbers = new int[elementNumber];
        int sum = 0;
        for (int i = 0; i < elementNumber; i++) {
            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
        }
        System.out.print("Sum of ");
        for (int i = 0; i < elementNumber; i++) {
            if (i == elementNumber - 1) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + " + ");
        }
        System.out.print(" = " + sum);
        scanner.close();
    }
}
