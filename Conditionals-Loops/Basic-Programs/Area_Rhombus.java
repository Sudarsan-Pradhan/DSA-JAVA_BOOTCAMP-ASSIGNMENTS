import java.util.*;

public class Area_Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first diagonal of the rhombus:");
        int d1 = input.nextInt();
        System.out.print("Enter the second diagonal of the rhombus:");
        int d2 = input.nextInt();
        float Area = (d1 * d2 / 2);
        System.out.println("Area of the Rhombus is " + Area + " sqr mtr.");
        input.close();
    }

}