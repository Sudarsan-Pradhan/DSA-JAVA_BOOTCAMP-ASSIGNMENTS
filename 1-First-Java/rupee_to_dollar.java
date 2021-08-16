import java.util.*;

public class rupee_to_dollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rupee:");
        float rupee = input.nextFloat();
        float dollar = (float) (rupee / 74.19);
        System.out.println("Rs " + rupee + " = " + " $ " + dollar);
        input.close();
    }
}
