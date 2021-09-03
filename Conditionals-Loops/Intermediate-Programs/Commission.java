import java.util.*;

public class Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Calculate Commission Percentage.");
        System.out.println("2.Calculate Commission Amount.");
        while (true) {
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            if (choice == 1 || choice == 2) {
                if (choice == 1) {

                    System.out.print("Enter Amount: ");
                    float amount = scanner.nextFloat();
                    System.out.print("Enter commission Amount: ");
                    float CommissionAmount = scanner.nextFloat();
                    float commissionPercentage = (CommissionAmount / amount) * 100;
                    System.out.println("Commission Percentage is : " + commissionPercentage + "%");

                }
                if (choice == 2) {
                    System.out.print("Enter Amount: ");
                    float amount = scanner.nextFloat();
                    System.out.print("Enter commission Percentage: ");
                    float CommissionPercentage = scanner.nextFloat();
                    float CommissionAmount = (CommissionPercentage / 100) * amount;
                    System.out.println("Commission Amount is " + CommissionAmount);

                }
            } else if (choice == 0) {
                System.out.println("Program terminated.....😞");
                break;

            } else {
                System.out.println("Invalid input..Try again...!!");
            }

        }
        scanner.close();
    }

}
