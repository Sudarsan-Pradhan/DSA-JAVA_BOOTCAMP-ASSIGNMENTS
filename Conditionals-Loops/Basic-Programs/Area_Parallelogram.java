import java.util.*;

public class Area_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram:");
        int base = input.nextInt();
        System.out.print("Enter the height of the parallelogram:");
        int height = input.nextInt();
        float Area = base * height;
        System.out.println("Area of the parallelogram is " + Area + " sqr mtr.");
        input.close();
    }

}
