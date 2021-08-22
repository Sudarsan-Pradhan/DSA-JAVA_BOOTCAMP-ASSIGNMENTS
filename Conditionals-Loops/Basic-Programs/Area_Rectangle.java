import java.util.*;

public class Area_Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        int length = input.nextInt();
        System.out.print("Enter the breadth of the rectangle:");
        int breadth = input.nextInt();
        float area = length * breadth;
        System.out.println("Area of the rectangle is " + area + " sqr. mtr.");
        input.close();

    }

}
